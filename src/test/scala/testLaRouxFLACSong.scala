import org.scalatest._

class testLaRouxFLACSong extends FunSuite with BeforeAndAfter  {

  var track: Song = _

  before {
    track = new Song("C:\\TEMP\\two.flac", new FfmpegTagReader())
  }

  test(testName = "track has correct path") {
    assert(track.getPath == "C:\\TEMP\\two.flac")
  }

  test(testName = "song has correct album") {
    assert(track.getAlbum == "Supervision")
  }

  test(testName = "song has correct year") {
    assert(track.getYear == "2020")
  }

  test(testName = "song has correct artist") {
    assert(track.getArtist == "La Roux")
  }

  test(testName = "song has correct track") {
    assert(track.getTrack == "8")
  }

  test(testName = "song has correct genre") {
    assert(track.getGenre == "pop")
  }

  test(testName = "song has correct comment") {
    assert(track.getComment == "")
  }

  test(testName = "song has correct album artist") {
    assert(track.getAlbumArtist == "La Roux")
  }

  test(testName = "song has correct composer") {
    assert(track.getComposer == "")
  }

  test(testName = "song has correct disc number") {
    assert(track.getDiscNumber == "1")
  }
  test(testName = "song has correct image") {
    assert(track.getImage() == "IMAGE")
  }

}
