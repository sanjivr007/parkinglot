package main.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class ParkingLotManagerTest {
	
	@Before
	  public void setUp() throws Exception {
	    
	  }
	
	@Test
	  public void shouldCreateParkingLotTest() {}
	
	@Test
	  public void shouldNotCreateParkingLotAlreadyPresent() {}
	
	@Test
	  public void shouldNotParkIncorrectParkingLot() {}
	
	@Test
	  public void shouldNotParkRegistrationNumberAlreadyPresent() {}
	
	@Test
	  public void shouldNotParkSlotsFull() {}
	
	@Test
	public void shouldParkAndFillTheMaps() {}
	
	@Test
	public void shouldNotEmptySlotInvalidParkingLot() {}
	
	@Test
	public void shouldEmptySlotAndUpdateMaps() {}
	
	@Test
	public void shouldNotEmptySlotVehicleNotPresent() {}

	@Test
	public void testGetStatusParkingLotNotPresent() {}
	
	@Test
	public void testGetStatusEmptyParkingLot() {}
	
	@Test
	public void testGetStatusParkingLotNotEmpty() {}
	
	@Test
	public void testGetRegistrationNumbersForColourParkingLotNotPresent() {}
	
	@Test
	public void testGetRegistrationNumbersForColourColourNotPresent() {}
	
	@Test
	public void testGetRegistrationNumbersForColourSingleCar() {}
	
	@Test
	public void testGetRegistrationNumbersForColourMoreThanSingleCar() {}
	
	@Test
	public void testGetSlotNumbersForColourParkingLotNotPresent() {}
	  
	@Test
	public void testGetSlotNumbersForColourColourNotPresent() {}
	
	@Test
	public void testGetSlotNumbersForColourSingleCar() {}
	  
	@Test
	public void testGetSlotNumbersForColourMoreThanSingleCar() {}
	
	@Test
	public void testGetSlotNumberForRegistrationNumberParkingLotNotPresent() {}
	
	@Test
	public void testGetSlotNumberForRegistrationNumberNotPresent() {}
	
	@Test
	public void testGetSlotNumberForRegistrationNumberPresent() {}
	  
	  

}

