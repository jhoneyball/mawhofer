import org.scalatest._

class testTaylorSwiftMP3Song extends FunSuite with BeforeAndAfter  {

  var track: Song = _

  before {
    track = new Song("C:\\TEMP\\one.mp3", new FfmpegTagReader())
  }

  test(testName = "track has correct path") {
    assert(track.getPath == "C:\\TEMP\\one.mp3")
  }

  test(testName = "song has correct album") {
    assert(track.getAlbum == "folklore")
  }

  test(testName = "song has correct year") {
    assert(track.getYear == "2020")
  }

  test(testName = "song has correct artist") {
    assert(track.getArtist == "Taylor Swift")
  }

  test(testName = "song has correct track") {
    assert(track.getTrack == "1/16")
  }

  test(testName = "song has correct genre") {
    assert(track.getGenre == "Alternative")
  }

  test(testName = "song has correct comment") {
    assert(track.getComment == "")
  }

  test(testName = "song has correct album artist") {
    assert(track.getAlbumArtist == "Taylor Swift")
  }

  test(testName = "song has correct composer") {
    assert(track.getComposer == "Taylor Swift, Aaron Dessner")
  }

  test(testName = "song has correct disc number") {
    assert(track.getDiscNumber == "1/1")
  }
  test(testName = "song has correct image") {
    assert(track.getImage() == "IMAGE")
  }

}
