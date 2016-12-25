package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {

	private Texture badlogic;// nombre interno tarjetas gráficas
	private SpriteBatch batch;
	private int x,y,xBad,yBad;

	public MyGdxGame() {
		// no hacer nada crítico
	}

	@Override
	public void create() {
		badlogic=new Texture("badlogic.jpg"); // mejor utilizar png
		batch = new SpriteBatch();

		x=Gdx.graphics.getWidth();  //ancho pantalla
		y=Gdx.graphics.getHeight(); // alto pantalla
		xBad=badlogic.getWidth(); // ancho imagen
		yBad=badlogic.getHeight(); // alto imagen

	}

	@Override
	public void dispose() {

		badlogic.dispose();  // muy importante liberar recursos
		batch.dispose();
	}

	@Override
	public void render() {
		// es más eficiente representar todas las texturas de golpe, repesentar 1 textura= representar 50
		Gdx.gl.glClearColor(1,0.12f,0.67f,0.19f); //color fondo. rojo, verda, azul, intensidad, valores de 0 a 1
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //limpia buffer tarjeta
		Gdx.graphics.getWidth();  //ancho
		Gdx.graphics.getHeight(); // alto
		batch.begin();
		batch.draw(badlogic,0,0); // está en la izquierda debajo x, y
		batch.draw(badlogic,x-xBad,y-yBad);
		batch.draw(badlogic,200,300,20,20); // tamaño 20x20


		batch.end();

	}
}
