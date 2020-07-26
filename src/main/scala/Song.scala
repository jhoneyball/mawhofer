class Song(var filePath: String, var tagReader: TagReader) {
  private var _path = filePath
  tagReader.openFileForTagReading(_path)
  private var _uid: String = tagReader.getUidFromFile
  private var _audioHash: String = tagReader.getAudioHashFromFile
  private var _title: String = tagReader.getTitleFromFile
  private var _artist: String = tagReader.getArtistFromFile
  private var _album: String = tagReader.getAlbumFromFile
  private var _year: String = tagReader.getYearFromFile
  private var _track: String = tagReader.getTrack
  private var _genre: String = tagReader.getGenreFromFile
  private var _comment: String = tagReader.getCommentFromFile
  private var _albumArtist: String = tagReader.getAlbumArtistFromFile
  private var _composer: String = tagReader.getComposerFromFile
  private var _discNumber: String = tagReader.getDiscNumberFromFile
  private var _image: String = tagReader.getImageFromFile

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
}
