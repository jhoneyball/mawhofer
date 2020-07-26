import org.bytedeco.ffmpeg.avformat.AVFormatContext
import org.bytedeco.ffmpeg.avutil.AVDictionaryEntry
import org.bytedeco.ffmpeg.global.avformat.{av_dump_format, avformat_close_input, avformat_open_input}
import org.bytedeco.ffmpeg.global.avutil.{AV_DICT_IGNORE_SUFFIX, av_dict_get}

class FfmpegTagReader extends TagReader {
  private var _uid: String = ""
  private var _audioHash: String = ""
  private var _title: String = ""
  private var _artist: String = ""
  private var _album: String = ""
  private var _year: String = ""
  private var _track: String = ""
  private var _genre: String = ""
  private var _comment: String = ""
  private var _albumArtist: String = ""
  private var _composer: String = ""
  private var _discNumber: String = ""
  private var _image: String = ""

  private var _filenamePath: String = ""
  private val avFormatContext = new AVFormatContext(null)

  def getUidFromFile: String = _uid
  def getAudioHashFromFile: String = _audioHash
  def getTitleFromFile: String = _title
  def getArtistFromFile: String = _artist
  def getAlbumFromFile: String = _album
  def getYearFromFile: String = _year
  def getTrack: String = _track
  def getGenreFromFile: String = _genre
  def getCommentFromFile: String = _comment
  def getAlbumArtistFromFile: String = _albumArtist
  def getComposerFromFile: String = _composer
  def getDiscNumberFromFile: String = _discNumber
  def getImageFromFile: String = _image
  def getPathFromFile: String = _filenamePath

  override def openFileForTagReading(filenamePath: String): Boolean = {
    _filenamePath = filenamePath
    var ret: Int = -1
    ret = avformat_open_input(avFormatContext, _filenamePath, null, null)
    if (ret == 0) {
      populateTags()
      av_dump_format(avFormatContext, 0, _filenamePath, 0)
      avformat_close_input(avFormatContext)
      true
    } else false
  }

  private def populateTags (): Unit = {

    val TITLE_TAG = "title"
    val ALBUM_TAG = "album"
    val TSRC_TAG = "TSRC"
    val COPYRIGHT_TAG = "copyright"
    val PUBLISHER_TAG = "publisher"
    val GENRE_TAG = "genre"
    val UPC_TAG = "UPC"
    val TRACK_TAG = "track"
    val DISC_TAG = "disc"
    val ARTIST_TAG = "artist"
    val ALBUMARTIST_TAG = "album_artist"
    val COMPOSER_TAG = "composer"
    val ENGINEER_TAG = "ENGINEER"
    val MIXER_TAG = "MIXER"
    val DATE_TAG = "date"
    val COMMENT_TAG = "comment"
    val IMAGE_TAG = "image"


    _uid = "UUID"
    _audioHash = "AUDIOHASH"
    _title = getTagFromFile(TITLE_TAG)
    _artist = getTagFromFile(ARTIST_TAG)
    _album = getTagFromFile(ALBUM_TAG)
    _year = getTagFromFile(DATE_TAG)
    _track = getTagFromFile(TRACK_TAG)
    _genre = getTagFromFile(GENRE_TAG)
    _comment = getTagFromFile(COMMENT_TAG)
    _albumArtist = getTagFromFile(ALBUMARTIST_TAG)
    _composer = getTagFromFile(COMPOSER_TAG)
    _discNumber = getTagFromFile(DISC_TAG)
    _image = "IMAGE"
  }

  private def getTagFromFile(tag: String): String = {
    var avDictionaryEntry: AVDictionaryEntry = av_dict_get(avFormatContext.metadata(), tag, null, AV_DICT_IGNORE_SUFFIX)
    if (avDictionaryEntry == null) return ""
    avDictionaryEntry.value().getString
  }
}
