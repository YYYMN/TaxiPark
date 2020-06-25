package by.novikau.taxipark.controller;

public interface Navigation {

	String USER = "user";
	String ID = "id";
	String LOAD = "/load";
	String ID_PATH_PARAM = "/{" + ID + "}";
	String LOAD_BY_ID = LOAD + ID_PATH_PARAM;
}
