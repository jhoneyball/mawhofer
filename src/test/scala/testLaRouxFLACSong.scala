import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class testLaRouxFLACSong extends AnyFunSuite with BeforeAndAfter {

  var songUnderTest: Song = _

  before {
    songUnderTest = new Song("C:\\TEMP\\two.flac", new FfmpegMetadataReader())
  }

  test(testName = "track has correct path") {
    assert(songUnderTest.getPath == "C:\\TEMP\\two.flac")
  }

  test(testName = "song has correct album") {
    assert(songUnderTest.getAlbum == "Supervision")
  }

  test(testName = "song has correct year") {
    assert(songUnderTest.getYear == "2020")
  }

  test(testName = "song has correct artist") {
    assert(songUnderTest.getArtist == "La Roux")
  }

  test(testName = "song has correct track") {
    assert(songUnderTest.getTrack == "8")
  }

  test(testName = "song has correct genre") {
    assert(songUnderTest.getGenre == "pop")
  }

  test(testName = "song has correct comment") {
    assert(songUnderTest.getComment == "")
  }

  test(testName = "song has correct album artist") {
    assert(songUnderTest.getAlbumArtist == "La Roux")
  }

  test(testName = "song has correct composer") {
    assert(songUnderTest.getComposer == "")
  }

  test(testName = "song has correct disc number") {
    assert(songUnderTest.getDiscNumber == "1")
  }

  test(testName = "song has correct image") {
    assert(songUnderTest.getImage == "IMAGE")
  }

  test(testName = "song has correct image size") {
    assert(songUnderTest.getImageSize == "3")
  }
  test(testName = "song has correct image width") {
    assert(songUnderTest.getImageWidth == "1000")
  }
  test(testName = "song has correct image height") {
    assert(songUnderTest.getImageHeight == "1000")
  }

}
