class Song(var filePath: String, var metadataReader: MetadataReader) {
  private var _path = filePath
  metadataReader.openFileForTagReading(_path)
  private var _uid: String = metadataReader.getUidFromFile
  private var _audioHash: String = metadataReader.getAudioHashFromFile
  private var _title: String = metadataReader.getTitleFromFile
  private var _artist: String = metadataReader.getArtistFromFile
  private var _album: String = metadataReader.getAlbumFromFile
  private var _year: String = metadataReader.getYearFromFile
  private var _track: String = metadataReader.getTrack
  private var _genre: String = metadataReader.getGenreFromFile
  private var _comment: String = metadataReader.getCommentFromFile
  private var _albumArtist: String = metadataReader.getAlbumArtistFromFile
  private var _composer: String = metadataReader.getComposerFromFile
  private var _discNumber: String = metadataReader.getDiscNumberFromFile
  private var _image: String = metadataReader.getImageFromFile
  private var _image_width: String = metadataReader.getImageWidthFromFile
  private var _image_height: String = metadataReader.getImageHeightFromFile
  private var _image_size: String = metadataReader.getImageSizeFromFile
  private var _length_seconds: String = metadataReader.getLengthSecondsFromFile
  private var _bit_depth: String = metadataReader.getBitDepthFromFile
  private var _sample_rate: String = metadataReader.getSampleRateFromFile

  def getPath: String = _path
  def getUid: String = _uid
  def getAudioHash: String = _audioHash
  def getTitle: String = _title
  def getArtist: String = _artist
  def getAlbum: String = _album
  def getYear: String = _year
  def getTrack: String = _track
  def getGenre: String = _genre
  def getComment: String = _comment
  def getAlbumArtist: String = _albumArtist
  def getComposer: String = _composer
  def getDiscNumber: String = _discNumber
  def getImage: String = _image
  def getImageSize: String = _image_size
  def getImageHeight: String = _image_height
  def getImageWidth: String = _image_width

}
