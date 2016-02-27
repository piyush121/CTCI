package ch_9;

enum color {
	black, white, red, gree, blue, yellow
}

public class nine_seven {

	public static void floodFill(color[][] screen, int x, int y, color prevColor, color newColor) {
		if (screen[y][x] != prevColor || x < 0 || y < 0 || x > screen.length || y > screen[0].length)
			return;
		else {
			screen[y][x] = newColor; // y is actually the num of rows and x the
										// num of columns in this case. Remember
										// that!
			floodFill(screen, x - 1, y, prevColor, newColor);
			floodFill(screen, x + 1, y, prevColor, newColor);
			floodFill(screen, x, y - 1, prevColor, newColor);
			floodFill(screen, x, y + 1, prevColor, newColor);

		}
	}

}
