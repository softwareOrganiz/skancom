package acceptance;
import skancom.House;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;

public class editinghouse {
	
	private House newHouse;
    private boolean isHouseUpdated;
    String houseid;

    @Given("The owner wants to update the photo of a house")
    public void the_owner_wants_to_update_the_photo_of_a_house() {
    	 throw new io.cucumber.java.PendingException();
    	// The implementation for this step is not needed as it is just a description of the scenario.
    }

    @Given("The owner enters the house ID {string}")
    public void the_owner_enters_the_house_id(String houseId) {
        // Here you can set up the new house object with the given house ID.

    	 throw new io.cucumber.java.PendingException();
    }

    @When("The owner provides the new photo information {string}")
    public void the_owner_provides_the_new_photo_information(String newPhoto) {
        // Set the new photo for the new house.
    	 throw new io.cucumber.java.PendingException();

    }

    @Then("The photo of the house with ID {string} is updated successfully")
    public void the_photo_of_the_house_with_id_is_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the photo is updated successfully.
        // For example:
    	 throw new io.cucumber.java.PendingException();
     
    }

    @Given("The owner wants to update the location of a house")
    public void the_owner_wants_to_update_the_location_of_a_house() {
    	 throw new io.cucumber.java.PendingException();
    	// The implementation for this step is not needed as it is just a description of the scenario.
    }

    @When("The owner provides the new location information {string}")
    public void the_owner_provides_the_new_location_information(String newLocation) {
        // Set the new location for the new house.
    	 throw new io.cucumber.java.PendingException();
        
    }

    @Then("The location of the house with ID {string} is updated successfully")
    public void the_location_of_the_house_with_id_is_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the location is updated successfully.
        // For example:
    	 throw new io.cucumber.java.PendingException();
      
    }

    @Given("The owner wants to update the available services of a house")
    public void the_owner_wants_to_update_the_available_services_of_a_house() {
    	 throw new io.cucumber.java.PendingException();
    	// The implementation for this step is not needed as it is just a description of the scenario.
    }

    @When("The owner provides the new available services information {string}")
    public void the_owner_provides_the_new_available_services_information(String newServices) {
        // Set the new available services for the new house.
    	 throw new io.cucumber.java.PendingException();
    }

    @Then("The available services of the house with ID {string} are updated successfully")
    public void the_available_services_of_the_house_with_id_are_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the available services are updated successfully.
        // For example:
    	 throw new io.cucumber.java.PendingException();
    }

    @Given("The owner wants to update the monthly rent of a house")
    public void the_owner_wants_to_update_the_monthly_rent_of_a_house() {
    	 throw new io.cucumber.java.PendingException();
    	// The implementation for this step is not needed as it is just a description of the scenario.
    }

    @When("The owner provides the new monthly rent information {string}")
    public void the_owner_provides_the_new_monthly_rent_information(String newMonthlyRent) {
        // Set the new monthly rent for the new house.
    	 throw new io.cucumber.java.PendingException();
      
    }

    @Then("The monthly rent of the house with ID {string} is updated successfully")
    public void the_monthly_rent_of_the_house_with_id_is_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the monthly rent is updated successfully.
        // For example: 
    	throw new io.cucumber.java.PendingException();
        
    }

    @Given("The owner wants to update the contact information of a house")
    public void the_owner_wants_to_update_the_contact_information_of_a_house() {
    	 throw new io.cucumber.java.PendingException();
    	// The implementation for this step is not needed as it is just a description of the scenario.
    }

    @When("The owner provides the new contact information {string}")
    public void the_owner_provides_the_new_contact_information(String newContactInfo) {
        // Set the new contact information for the new house.
    	 throw new io.cucumber.java.PendingException();
    }

    @Then("The contact information of the house with ID {string} is updated successfully")
    public void the_contact_information_of_the_house_with_id_is_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the contact information is updated successfully.
        // For example:
    	 throw new io.cucumber.java.PendingException(); 
    }
    
    @Given("There are existing houses in the system")
    public void there_are_existing_houses_in_the_system() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The owner enters an invalid house ID {string}")
    public void the_owner_enters_an_invalid_house_id(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The system displays an error message {string}")
    public void the_system_displays_an_error_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
