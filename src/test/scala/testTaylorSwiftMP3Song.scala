import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class testTaylorSwiftMP3Song extends AnyFunSuite with BeforeAndAfter {

  var songUnderTest: Song = _

  before {
    songUnderTest = new Song("C:\\TEMP\\one.mp3", new FfmpegMetadataReader())
  }

  test(testName = "track has correct path") {
    assert(songUnderTest.getPath == "C:\\TEMP\\one.mp3")
  }

  test(testName = "song has correct album") {
    assert(songUnderTest.getAlbum == "folklore")
  }

  test(testName = "song has correct year") {
    assert(songUnderTest.getYear == "2020")
  }

  test(testName = "song has correct artist") {
    assert(songUnderTest.getArtist == "Taylor Swift")
  }

  test(testName = "song has correct track") {
    assert(songUnderTest.getTrack == "1/16")
  }

  test(testName = "song has correct genre") {
    assert(songUnderTest.getGenre == "Alternative")
  }

  test(testName = "song has correct comment") {
    assert(songUnderTest.getComment == "")
  }

  test(testName = "song has correct album artist") {
    assert(songUnderTest.getAlbumArtist == "Taylor Swift")
  }

  test(testName = "song has correct composer") {
    assert(songUnderTest.getComposer == "Taylor Swift, Aaron Dessner")
  }

  test(testName = "song has correct disc number") {
    assert(songUnderTest.getDiscNumber == "1/1")
  }
  test(testName = "song has correct image") {
    assert(songUnderTest.getImage == "IMAGE")
  }

  test(testName = "song has correct image size") {
    assert(songUnderTest.getImageSize == "3")
  }
  test(testName = "song has correct image width") {
    assert(songUnderTest.getImageWidth == "1024")
  }
  test(testName = "song has correct image height") {
    assert(songUnderTest.getImageHeight == "1024")
  }


}
