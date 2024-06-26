package com.musicacademy.osgi.musicresourcespublisher;

import java.util.ArrayList;
import java.util.Scanner;

/***
 *
 * @author Hapugala H.A.V.V.
 *
 */
public class MusicResourcePublisherImpl implements IMusicResourcePublisher {
	Scanner scn = new Scanner(System.in);
	 
	ArrayList<InstrumentModel> instrumentList = new ArrayList<InstrumentModel>();

	//Function to add music instruments
	@Override
	public void addMusicalInstruments() {
		char loopContinue ;
		do {
			InstrumentModel inst = new InstrumentModel();
			//selecting the instrument type
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Select the instrument type to add a new musical instrument(1-5)");
			System.out.println("--------------------------------------------------------------------");
			
			//Displaying instrument types
			System.out.println("1 - StringInstrument");
			System.out.println("2 - Keyboard");
			System.out.println("3 - Woodwind");
			System.out.println("4 - Brass");
			System.out.println("5 - Percussion");
			
			int instrument = scn.nextInt();
			switch(instrument) {
		
				//switch cases to check and assign the instrument type
				case 1:
					inst.setInstrument("String Type Instrument");
					break;
				case 2:
					inst.setInstrument("Keyboard Type Instrument");
					break;
				case 3:
					inst.setInstrument("Woodwind Keyboard Type Instrument");
					break;
				case 4:
					inst.setInstrument("Brass Keyboard Type Instrument");
					break;
				case 5:
					inst.setInstrument("Percussion Keyboard Type Instrument");
					break; 
				default:
					System.out.println("Error: Invalid Menu Selection.");
			}
		if(instrument<=5 ||instrument >=1) {
			
			//Getting the instrument details
			System.out.println("Enter music instrument name : ");
			String iname = scn.nextLine();
			inst.setName(scn.next());
		
			System.out.println("Enter instrument model's serial number: ");
			String itypenum = scn.next();
			inst.setType(itypenum);
			
			System.out.println("Enter instrument's model brand: ");
			String ibrand = scn.next(); 
			inst.setBrand(ibrand);
		
			System.out.println("Enter Price : ");
			Double iprice = scn.nextDouble();
			inst.setPrice(iprice);
		}
		
		try {
			instrumentList.add(inst);
			System.out.println("------All the Music instrument that has been successfully added to the system!---------");
		}
		catch(Exception e){
			e.printStackTrace();		
		}
		System.out.println("\n Do you have another musical instrument to add (Y/N) ?");
		String response = scn.next();
		
		//condition to stop the loop
		if(response.charAt(0)=='n'||response.charAt(0)=='N')
			break;
		loopContinue = response.charAt(0);
		}while(loopContinue=='Y'||loopContinue=='y');
		System.out.println("Thank you! \n\n");
	}

	//Function to retrieve music instrument details
	@Override
	public void displayInstrumentList() {
		System.out.println("---------------------------------------------------------");
		System.out.println("****Retrieving all the musical instrument details****");
		System.out.println("---------------------------------------------------------");
		for(InstrumentModel inst:instrumentList) {
			this.displayInstrumentDetails(inst);
		}
	}
	public void displayInstrumentDetails(InstrumentModel inst) {
		System.out.println("");
		System.out.println("Instrument Type : "+inst.getInstrument());
		System.out.println("Model Number : "+inst.getType());
		System.out.println("Instrument Name : "+inst.getName());
		System.out.println("Instrument Brand : "+inst.getBrand());
		System.out.println("Price : "+inst.getPrice());
		System.out.println("-------------------------------");
		
	}
	
	//Function to update specific music instruments
	public void updateMusicItem(){
		char loopContinue ;
		
		System.out.println("\n\n----------------------------------------------------------------------------------------------------------------");	
		System.out.println("******Given Below are all the musical instruments which was added to the music academy which can be updated******");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		for(InstrumentModel inst:instrumentList) {
			this.displayInstrumentDetails(inst);
		}
		do {
		System.out.println("Enter the model number of the instrument you want to update");
		String updateModel=scn.next();
		
		System.out.println("Enter the section number you want to update(1-5)");
		System.out.println("1 - Instrument Type");
		System.out.println("2 - Model Number");
		System.out.println("3 - Instrument Name");
		System.out.println("4 - Instrument Brand");
		System.out.println("5 - Price");
	
		int updateSection = scn.nextInt();
		
		int itemId =0;
		
		for(InstrumentModel inst:instrumentList) {
			itemId++;
			//comparing model number
			if(inst.getType().equals(updateModel)) {			
				switch(updateSection) {
		
				case 1:
					System.out.println("Enter new instrument type");
					inst.setInstrument(scn.next());
					break;
				case 2:
					System.out.println("Enter new model number");
					inst.setType(scn.next());
					break;
				case 3:
					System.out.println("Enter new instrument name");
					inst.setName(scn.next());
					break;
				case 4:
					System.out.println("Enter new instrument brand");
					inst.setBrand(scn.next());
					break;
				case 5:
					System.out.println("Enter new price");
					inst.setPrice(scn.nextDouble());
					break; 
				default:
					System.out.println("Error: Invalid Menu Selection.");
				}
			}
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("----  Given below are all the musical instruments after udpdate   -----");
		System.out.println("---------------------------------------------------------------------------");
		for(InstrumentModel inst:instrumentList) {
		this.displayInstrumentDetails(inst);
		}
		System.out.println("\n Do you have another musical instrument to update (Y/N) ?");
		String response = scn.next();
		
		if(response.charAt(0)=='n'||response.charAt(0)=='N')
			break;
		loopContinue = response.charAt(0);
		}while(loopContinue=='Y'||loopContinue=='y');
		System.out.println("Thank you!");
	 }
	
	//Function to delete specific music instruments
	@Override
	public void deleteMusicItem(){
		char loopContinue ;
		
		System.out.println("\n\n----------------------------------------------------------------------------------");
		System.out.println("******Given below are all the musical instruments which you can delete******");
		System.out.println("----------------------------------------------------------------------------------");
		
		for(InstrumentModel inst:instrumentList) {
			this.displayInstrumentDetails(inst);
		}
		do {
		System.out.println("Enter the model number of the instrument you want to remove");
		String remvModel=scn.next();
		int itemId =0;
		
		for(InstrumentModel inst:instrumentList) {
			itemId++;
			
			//condition to compare model number
			if(inst.getType().equals(remvModel)) {
				System.out.println(itemId);
				instrumentList.remove(itemId-1);
				System.out.println("Music instrument with model number: "+inst.getType()+" removed successfully");
				break;
			}
		 }
		System.out.println("\n\n----------------------------------------------------------------");
		System.out.println("       Other instruments in the music store after deletion      ");
		System.out.println("-----------------------------------------------------------------");
		for(InstrumentModel inst:instrumentList) {
			this.displayInstrumentDetails(inst);
		}
		 
		System.out.println("\n Do you have another musical instrument to delete (Y/N) ?");
		String response = scn.next();
		
		if(response.charAt(0)=='n'||response.charAt(0)=='N')
			break;
		loopContinue = response.charAt(0);
		}while(loopContinue=='Y'||loopContinue=='y');
		System.out.println("Thank you!");
	}
	
	//Function to choose a specific option
	@Override
	public void chooseAnOption(String consumer) {
		boolean run=true;
		do {
			if(consumer.equals("student")) {
				System.out.println("Select your choice(1-2) :");
				System.out.println("1 - View musical instruments");
				System.out.println("2 - Exit");
				
			    int response = scn.nextInt();		
					switch(response) {
			
					case 1:
						this.displayInstrumentList();
						break;
					case 2:
						run=false;
						break; 
					default:
						System.out.println("------------------------");
						System.out.println("    Invalid input");
						System.out.println("------------------------");
					}
			} else {
				// options for Admin
				System.out.println("Select your choice(1-5) :");
				System.out.println("1 - Add a musical instrument");
				System.out.println("2 - View musical instruments");
				System.out.println("3 - Update musical instrument details ");
				System.out.println("4 - Delete musical instrument details");
				System.out.println("5 - Exit");
				
			    int response = scn.nextInt();		
					switch(response) {
			
					case 1:
						this.addMusicalInstruments();
						break;
					case 2:
						this.displayInstrumentList();
						break;
					case 3:
						this.updateMusicItem();
						break;
					case 4:
						this.deleteMusicItem();
						break;
					case 5:
						run=false;
						break; 
					default:
						System.out.println("------------------------");
						System.out.println("    Invalid input");
						System.out.println("------------------------");
					}
				
			}
			
		}while(run==true);
	}
}



