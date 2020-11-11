package chapter2_objects;

import Toolkit.Picture;

/**
 * •• E2.17
 * Using the Picture class of Worked Example 2.2,
 * write a HalfSizePicture program that
 * loads a picture and shows it at half the original size,
 * centered in the window.
 *
 * Created by ag on 08-Nov-20 3:35 PM
 */
class Ex2_17_HalfSizePicture {
  public static void main(String[] args) {
    Picture picture = new Picture();
    picture.load("queen-mary.png");

    int halfWidth = picture.getWidth() / 2;
    int halfHeight = picture.getHeight() / 2;

    picture.scale(halfWidth, halfHeight);

    picture.move(halfWidth / 2, halfHeight / 2);
  }
}
