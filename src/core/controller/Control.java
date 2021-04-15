package core.controller;
import core.model.*;
import core.view.*;

public class Control {
	 model model;
	 ConsoleInterface view=new ConsoleInterface();
	private int number;
	private int typeOfData,typeOfView,restart; 
	
	
public Control(core.model.model model, ConsoleInterface view) {
		super();
		this.model = model;
		this.view = view;
	}

public void init() {
	view.numberOfElements();
	number=model.enterAndVerifyIntInput();
	String [] array = new String[number];
	view.typeOfArray();
	typeOfData=model.enterAndVerifyTypeOfdataInput();
	view.enterOfElements();
	switch (typeOfData) {
	case 1:{
		array=model.stockageOfStringElements(number);		
	}break;
	case 2:{
		array= model.sortIntTable(model.stockageOfIntElements(number));
	}break;
	case 3:{
		array=model.sortShortTable(model.stockageOfShortElements(number));
	}break;
	case 4:{
		array=model.sortLongTable(model.stockageOfLongElements(number));
	}break;
	case 5:{
		array=model.sortFloatTable(model.stockageOfFloatElements(number));
	}break;
	case 6:{
		array=model.sortDoubleTable(model.stockageOfDoubleElements(number));
	}break;
	case 7:{
		array=model.sortCharTable(model.stockageOfCharElements(number));
	}break;
	}
	view.typeOfView();
	typeOfView=model.enterAndVerifyTypeOfListViewInput();
	if (typeOfView==1) {
		view.HorizontalListView(array,typeOfData);
	}else {
		view.VerticalListView(array,typeOfData);
	}
	view.restart();
	restart=model.restartInput();
	if(restart==0) {
		view.endMessage();
	}else {
		init();
	}
}
}
