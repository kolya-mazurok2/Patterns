package com.stud;

import com.stud.adapter.SocketAdapter;
import com.stud.adapter.SocketClassAdapterImpl;
import com.stud.adapter.SocketObjectAdapterImpl;
import com.stud.adapter.Volts;
import com.stud.builder.HawaiianPizzaBuilder;
import com.stud.builder.Waiter;
import com.stud.factory.ComputerFactory;
import com.stud.factory.ComputerType;
import com.stud.factory.model.Computer;
import com.stud.proxy.HighResolutionImage;
import com.stud.proxy.Image;
import com.stud.proxy.ImageProxy;
import com.stud.singleton.Configuration;
import com.stud.builder.PizzaBuilder;

public class App {
	public static void main(String[] args) {
		//singleton
		String projectName = Configuration.getInstance().getProperty("project_name");
		String firstPattern = Configuration.getInstance().getProperty("first_pattern");
		System.out.println("Project name: " + projectName + "\nFirst pattern: " + firstPattern);
		//factory
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "8 GB", "500 GB", "3 GHz");
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "32 GB", "4 TB", "4.2 GHz");
		System.out.println("PC config: " + pc);
		System.out.println("Server config: " + server);
		//builder
		Waiter w = new Waiter();
		PizzaBuilder hawaiian = new HawaiianPizzaBuilder();
		w.setPizzaBuilder(hawaiian);
		w.constructPizza();
		System.out.println("Hawaiian pizza contains: " + w.getPizza());
		//proxy
		Image img = new ImageProxy("img/img.jpg");
		img.showImage();
		Image directly = new HighResolutionImage("img/high_reso.jpg");
		directly.showImage();
		//adapter
		SocketAdapter sa1 = new SocketClassAdapterImpl();
		Volts v3 = sa1.get3Volts();
		System.out.println("Class adapter(v3): " +v3 );
		SocketAdapter sa2 = new SocketObjectAdapterImpl();
		Volts v12 = sa2.get12Volts();
		System.out.println("Object adapter(v12): " +v12 );
	}
}
