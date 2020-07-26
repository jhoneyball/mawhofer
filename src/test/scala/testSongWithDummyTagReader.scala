  import org.scalatest._




  class testSongWithDummyTagReader extends FunSuite with BeforeAndAfter  {
    class DummyTagReader extends TagReader {
      def openFileForTagReading(filename: String): Boolean = {true}
      def getUidFromFile: String = "UID"
      def getAudioHashFromFile: String = "AUDIOHASH"
      def getTitleFromFile: String = "TheTitle"
      def getArtistFromFile: String = "TheArtist"
      def getAlbumFromFile: String = "TheAlbum"
      def getYearFromFile: String = "TheYear"
      def getTrack: String = "TheTrack"
      def getGenreFromFile: String = "TheGenre"
      def getCommentFromFile: String = "TheComment"
      def getAlbumArtistFromFile: String = "TheAlbumArtist"
      def getComposerFromFile: String = "TheComposer"
      def getDiscNumberFromFile: String = "TheDiscNumber"
      def getImageFromFile: String = "TheIMAGE"
      def getPathFromFile: String = "ThePath"
    }

    var track: Song = _

    before {
      track = new Song("ThePath", new DummyTagReader())
    }

    test(testName = "track has correct path")(assert(track.getPath == "ThePath"))

    test(testName = "song has correct album")(assert(track.getAlbum == "TheAlbum"))

    test(testName = "song has correct year")(assert(track.getYear == "TheYear"))

    test(testName = "song has correct artist")(assert(track.getArtist == "TheArtist"))

    test(testName = "song has correct track")(assert(track.getTrack == "TheTrack"))

    test(testName = "song has correct genre")(assert(track.getGenre == "TheGenre"))

    test(testName = "song has correct comment")(assert(track.getComment == "TheComment"))

    test(testName = "song has correct album artist")(assert(track.getAlbumArtist == "TheAlbumArtist"))

    test(testName = "song has correct composer")(assert(track.getComposer == "TheComposer"))

    test(testName = "song has correct disc number")(assert(track.getDiscNumber == "TheDiscNumber"))

    test(testName = "song has correct image")(assert(track.getImage == "TheIMAGE"))

  }
