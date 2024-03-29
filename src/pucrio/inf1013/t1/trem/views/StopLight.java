package pucrio.inf1013.t1.trem.views;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import pucrio.inf1013.t1.trem.state.StopLightState;

public class StopLight {

	private Point position;
	public static final int WIDTH = 50;
	public static final int HEIGHT = 100;

	public StopLight(Point pos) {
		this.position = pos;
	}

	public void render(Graphics2D g2, StopLightState state) {
		Color defaultColor = g2.getColor();
		boolean green = state.equals(StopLightState.OPEN);
		g2.setColor(Color.BLACK);
		g2.fillRect(this.position.x - StopLight.WIDTH / 2, position.y - StopLight.HEIGHT / 2, StopLight.WIDTH,
				StopLight.HEIGHT);
		RailControlSystemFrame.drawCircle(g2, this.position.x - 19, this.position.y - (green ? 38 : 19),
				StopLight.WIDTH / 2 - 6, green ? Color.GREEN : Color.RED);
		g2.setColor(defaultColor);
	}

}
