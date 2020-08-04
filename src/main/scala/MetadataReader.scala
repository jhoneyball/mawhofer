trait MetadataReader {

  def openFileForTagReading(filename: String): Boolean
  def getPathFromFile: String
  def getUidFromFile: String
  def getAudioHashFromFile: String
  def getTitleFromFile: String
  def getArtistFromFile: String
  def getAlbumFromFile: String
  def getYearFromFile: String
  def getTrack: String
  def getGenreFromFile: String
  def getCommentFromFile: String
  def getAlbumArtistFromFile: String
  def getComposerFromFile: String
  def getDiscNumberFromFile: String
  def getImageFromFile: String
  def getImageWidthFromFile: String
  def getImageHeightFromFile: String
  def getImageSizeFromFile: String
  def getLengthSecondsFromFile: String
  def getBitDepthFromFile: String
  def getSampleRateFromFile: String

}
