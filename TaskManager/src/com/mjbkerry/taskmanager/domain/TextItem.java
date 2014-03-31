package com.mjbkerry.taskmanager.domain;

import java.io.Reader;

public abstract class TextItem extends Item {
	public abstract String getText();
	public abstract Reader getReader();
}
