package com.miyuki.graphicslibrary;

public class Vector2 {

	public float x, y;

	public Vector2() {
		this.x = 0;
		this.y = 0;
	}

	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Vector2(Vector2 a) {
		this.x = a.x;
		this.y = a.y;
	}

	public static Vector2 add(Vector2 a, Vector2 b) {
		return new Vector2(a.x + b.x, a.y + b.y);
	}

	public static Vector2 minus(Vector2 a, Vector2 b) {
		return new Vector2(a.x - b.x, a.y - b.y);
	}

	public static Vector2 mul(Vector2 a, Vector2 b) {
		return new Vector2(a.x * b.x, a.y * b.y);
	}

	public static Vector2 div(Vector2 a, Vector2 b) {
		return new Vector2(a.x / b.x, a.y / b.y);
	}

	@Override
	public String toString() {
		return "{x: " + this.x + ",y: " + this.y + "}";
	}
}
