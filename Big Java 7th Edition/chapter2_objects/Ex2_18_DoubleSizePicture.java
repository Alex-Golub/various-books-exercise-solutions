package chapter2_objects;

import Toolkit.Picture;

/**
 * •• E2.18
 * Using the Picture class of Worked Example 2.2,
 * write a DoubleSizePicture program that
 * loads a picture, doubles its size, and
 * shows the center of the picture in the window.
 *
 * Created by ag on 08-Nov-20 3:56 PM
 */
class Ex2_18_DoubleSizePicture {
  public static void main(String[] args) {
    Picture picture = new Picture();
    picture.load("queen-mary.png");

    picture.scale(picture.getWidth() * 2,
            picture.getHeight() * 2);

    picture.move(picture.getWidth() / 4,
            picture.getHeight() / 4);
  }
}
