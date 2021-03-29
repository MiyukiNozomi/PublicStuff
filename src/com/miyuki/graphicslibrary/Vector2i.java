package com.miyuki.graphicslibrary;

public class Vector2i {

	public int x, y;

	public Vector2i() {
		this.x = 0;
		this.y = 0;
	}

	public Vector2i(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Vector2i(Vector2i a) {
		this.x = a.x;
		this.y = a.y;
	}

	public static Vector2i add(Vector2i a, Vector2i b) {
		return new Vector2i(a.x + b.x, a.y + b.y);
	}

	public static Vector2i minus(Vector2i a, Vector2i b) {
		return new Vector2i(a.x - b.x, a.y - b.y);
	}

	public static Vector2i mul(Vector2i a, Vector2i b) {
		return new Vector2i(a.x * b.x, a.y * b.y);
	}

	public static Vector2i div(Vector2i a, Vector2i b) {
		return new Vector2i(a.x / b.x, a.y / b.y);
	}

	@Override
	public String toString() {
		return "{x: " + this.x + ",y: " + this.y + "}";
	}
}
