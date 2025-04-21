package com.dsalgo.automation.stepdefinations;
import com.dsalgo.automation.pages.ArrayPage;
import io.cucumber.java.en.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.dsalgo.automation.utils.ExcelReader;

public class ArrayStepDef {

	ArrayPage array=new ArrayPage();
	List<Map<String, String>> testData = ExcelReader.getAllRows("Arrays");
	List<Map<String, String>> testData1 = ExcelReader.getAllRows("CodeEditor");
	List<Map<String, String>> testData2 = ExcelReader.getAllRows("Arrays_Practice_Editor");

	@When("The user clicks the Getting Started button in Array Panel After Sign in")
	public void the_user_clicks_the_button_in_array_panel_after_sign_in() {
		array.arrayHome();
	}

	@Then("The user be directed to Array Data Structure Page")
	public void the_user_be_directed_to_data_structure_page() {
		Map<String, String> specificRow = testData.get(0);
     	String expectedTitle = specificRow.get("PageTitle");
     	String arrayTitle = array.verfyArrayTitle();
     	Assert.assertEquals(arrayTitle, expectedTitle);
	}

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_page_after_sign_in() {


     }

	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_link() {
		array.arrayPythonLink();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_page() {
		Map<String, String> specificRow = testData.get(1);
     	String expectedTitle = specificRow.get("PageTitle");
     	String arrayPythonTitle = array.verfyArrayTitle();
     	Assert.assertEquals(arrayPythonTitle, expectedTitle);
	}

	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_page() {
		array.arrayPythonLink();
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page() {
		array.arrayPythonLinkTryEdit();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Map<String, String> specificRow = testData1.get(0);
     	String expectedTitle = specificRow.get("PageTitle");
     	String codeEditor = array.verfyArrayTitle();
     	Assert.assertEquals(codeEditor, expectedTitle);
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
		array.arrayPythonLink();
		array.arrayPythonLinkTryEdit();
	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		array.arrayPythonTextEditRun();

	}

	@Then("The user is not able to see an error message")
	public void the_user_is_not_able_to_see_an_error_message() {
		Map<String, String> specificRow = testData1.get(0);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutput();
        assertEquals(expectedOutput,codeOutput);
	}

	
	@When("The user write the invalid code in Editor and click the Run Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
		Map<String, String> specificRow = testData1.get(2);
    	String invalidCode = specificRow.get("InvalidCode");
    	array.verifyCodeEditor(invalidCode);
    	array.arrayPythonTextEditRun();
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() throws InterruptedException {
		Boolean isDisplayed = array.alertPresent();
    	assertTrue(isDisplayed);
    	array.readAlert();
		array.acceptAlert();

	}

	@When("The user write the valid code in Editor and click the Run Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
		Map<String, String> specificRow = testData1.get(1);
    	String validCode = specificRow.get("ValidCode");
    	array.verifyCodeEditor(validCode);
    	array.arrayPythonTextEditRun();
	}

	
	@Then("The user should able to see output in the console for Arrays")
	public void the_user_should_able_to_see_output_in_the_console_for_Arrays() {
		Map<String, String> specificRow = testData1.get(1);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutput();
        assertEquals(expectedOutput,codeOutput);
 	}
	
	
	
	@When("The user clicks Basic Operation in List link")
	public void the_user_clicks_link_of_the_Basic_Operation() {
	array.arrayBasicOperinListLink();
	
	}
	@Then("The user should be redirected to Basic Operation in List page")
	public void the_user_should_be_redirected_to_basic_operation_list_page() {
		
		Map<String, String> specificRow = testData.get(3);
     	String expectedTitle = specificRow.get("PageTitle");
     	String arrayUsingListTitle = array.verfyArrayTitle();
     	Assert.assertEquals(arrayUsingListTitle, expectedTitle);
	}
	@Given("The user is in the Array Topics page")
	public void the_user_is_in_the_array_topics_page() throws InterruptedException {
		Thread.sleep(2000);
		array.arrayPythonLink();
     }
	
	@When("The user clicks Arrays using List link of the Arrays Topics page left side menu")
	public void the_user_clicks_arrays_using_list_page_link_of_the_arrays_topics_page_left_side_menu() {
		array.arrayUsingListfromLeftMenu();
	}
	
	@When("The user clicks Basic Operation in List link of the Arrays Topics page left side menu")
	public void the_user_clicks_basic_operation_in_list_link_of_the_arrays_topics_page_left_side_menu() {
		array.arrayBasicOperationfromLeftMenu();
	}
	
	@Given("The user is on the Arrays Using List page")
	public void the_user_is_on_the_array_using_list_page() throws InterruptedException {
		Thread.sleep(2000);
		array.arrayUsingList();
	}
	@When("The user clicks Try Here button in Arrays using List page")
	public void the_user_clicks_button_in_arrays_using_list_page() {
	    array.arrayUsingListTryEdit();
	}
	
	
	@Given("The user is in the Arrays using List tryEditor page")
	public void the_user_is_in_the_arrays_using_list_try_editor_page() {
		array.arrayUsingList();
		array.arrayUsingListTryEdit();
		
	}

	@When("The user clicks Arrays using List link")
	public void the_user_clicks_link_of_the_arrays_topics_page_left_side_menu() {
	array.arrayUsingList();

	}
	@Then("The user should be redirected to Arrays using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		
		Map<String, String> specificRow = testData.get(2);
     	String expectedTitle = specificRow.get("PageTitle");
     	String arrayUsingListTitle = array.verfyArrayTitle();
     	Assert.assertEquals(arrayUsingListTitle, expectedTitle);	
	}
	
	@Given("The user is on the Basic Operation in List page")
	public void the_user_is_on_the_basic_operations_in_list_page() throws InterruptedException {
		Thread.sleep(2000);
		array.arrayBasicOperinListLink();
	}
	@When("The user clicks Try Here button in Basic Operation in List page")
	public void the_user_clicks_button_in_basic_operations_of_array_page() {
	 array.arrayBasicOperinListTryEdit();   
	}
	
	@Given("The user is in the Basic Operation tryEditor page")
	public void the_user_is_in_the_basic_operation_try_editor_page() {
		array.arrayBasicOperinListLink();
		array.arrayBasicOperinListTryEdit();
	}
	
	@When("The user clicks Applications of Array link")
	public void the_user_clicks_link_of_the_Applications_Array() {
	array.applicationOfArraryLink();
	}
	@Then("The user should be redirected to Application of Array page")
	public void the_user_should_be_redirected_to_Applications_of_Array_list_page() {
		
		Map<String, String> specificRow = testData.get(4);
     	String expectedTitle = specificRow.get("PageTitle");
     	String arrayUsingListTitle = array.verfyArrayTitle();
     	Assert.assertEquals(arrayUsingListTitle, expectedTitle);
	}
	@When("The user clicks Applications of Array link of the Arrays Topics page left side menu")
	public void the_user_clicks_Applications_of_Array_link_of_the_arrays_topics_page_left_side_menu() {
		array.arrayApplicationfromLeftMenu();
	}
	
	@Given("The user is on the Application of Array page")
	public void the_user_is_on_the_Application_of_Array_in_list_page() throws InterruptedException {
		Thread.sleep(2000);
		array.applicationOfArraryLink();
		
	}
	@When("The user clicks Try Here button in Applications of Array page")
	public void the_user_clicks_button_in_Applications_of_array_page() {
	 array.applicationOfArraryTryEdit();   
	}
	
	@Given("The user is in the Applications of Array tryEditor page")
	public void the_user_is_in_the_Applications_of_Array_try_editor_page() {
		array.applicationOfArraryLink();
		array.applicationOfArraryTryEdit();
	}
	@When("The user clicks Arrays Practice Questions button")
	public void the_user_clicks_button() {
		array.arrayPractieceQue();
	}
	@Then("The user should be redirected Arrays to Practice page")
	public void the_user_should_be_redirected_to_arrays_Practice_page() {
		array.verfyArrayTitle();
	}

	@Given("The user is on the Arrays Practice Questions page")
	public void the_user_is_on_the_Arrays_Practice_Questions_page()
	{
		array.arrayPythonLink();
		array.arrayPractieceQue();
	}
	
	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_Search_the_array_link() throws InterruptedException
	{
	Thread.sleep(2000);
	 array.searchArrayPractieceQue();
	}

	@Then("The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
		Map<String, String> specificRow = testData2.get(0);
     	String expectedTitle = specificRow.get("PageTitle");
     	String QuestionTitle = array.verfyArrayTitle();
     	Assert.assertEquals(QuestionTitle, expectedTitle);
	}

	@Given("The user is on the Search the array Practice Questions editor")
	public void the_user_is_on_the_search_array_practice_question_editor() {
		array.applicationOfArraryLink();
		array.arrayPractieceQue();
		array.searchArrayPractieceQue();
	}

	@When("The user write the invalid code in Practice Questions Editor and Click the Run Button")
	public void the_user_write_the_invalid_code_in_practiece_editor_and_click_the_run_button() {
		Map<String, String> specificRow = testData2.get(3);
    	String invalidCode = specificRow.get("InvalidCode");
    	array.verifyCodeEditor(invalidCode);
    	array.arrayPythonTextEditRun();	
	}

	@When("The user write the valid code in Practice Questions Editor and Click the Run Button")
	public void the_user_write_the_valid_code_in_Practice_Question_editor_and_click_the_run_button() {
		Map<String, String> specificRow = testData2.get(0);
    	String validCode = specificRow.get("ValidCode");
    	array.verifyCodeEditor(validCode);
    	array.arrayPythonTextEditRun();
		}

	@Then("The user should able to see Practiece Questions output in the console")
	public void the_user_should_able_to_see_Practiece_Questions_output_in_the_console() {
		Map<String, String> specificRow = testData2.get(0);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutput();
        assertEquals(expectedOutput,codeOutput);
       	}
	@When("The user write the invalid code in Practice Questions Editor and Click the Submit Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_submit_button() {
			Map<String, String> specificRow = testData2.get(3);
	    	String invalidCode = specificRow.get("InvalidCode");
	    	array.verifyCodeEditor(invalidCode);
	    	array.arrayPracticeSubmit();		
		}
	@Then("The user see an error message Error occurred during submission")
	public void the_user_see_an_error_message() {
		Map<String, String> specificRow = testData2.get(3);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutputError();
         assertEquals(expectedOutput,codeOutput);
        }
	@When("The user write the valid Search the Array code in Editor and Click the Submit Button")
	public void the_user_write_the_valid_code_in_Practice_Question_editor_and_click_the_submit_button() {
		Map<String, String> specificRow = testData2.get(2);
    	String validCode = specificRow.get("ValidCode");
    	array.verifyCodeEditor(validCode);
    	array.arrayPracticeSubmit();
		}

	@Then("The user is not able to see success message Submission successful")
	public void the_user_is_not_able_to_see_Submission_success_message() {
		Map<String, String> specificRow = testData2.get(2);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutput();
        assertEquals(expectedOutput,codeOutput,"Test case Failed: Out put from console is not matched with the expected output");
	}
	@When("The user Clicks the Run Button without entering any code in Editor")
	public void the_user_click_the_run_button_without_entering_code() {
		Map<String, String> specificRow = testData2.get(4);
    	String invalidCode = specificRow.get("InvalidCode");
    	array.verifyCodeEditor(invalidCode);
    	array.arrayPythonTextEditRun();
	}

	@Then("The user is not able to see error message for blank input")
	public void the_user_is_able_to_see_error_message() {
		Map<String, String> specificRow = testData2.get(4);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutput();
        assertEquals(expectedOutput,codeOutput,"Blank out put is displayed and Expected Vs Actual are matching");
  	}

	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_Max_Consecutive_Ones_link() throws InterruptedException
	{
	Thread.sleep(2000);
	array.maxConsucutiveOnesPractieceQue();
	}
	

	@Given("The user is on the Max Consecutive Ones practice question editor")
	public void the_user_is_on_the_MaxConsecutiveOnes_practice_question_editor() {
		array.applicationOfArraryLink();
		array.arrayPractieceQue();
		array.maxConsucutiveOnesPractieceQue();
	}

	@When("The user write the valid Max Consecutive Ones code in Editor and Click the Run Button")
	public void the_user_write_the_valid_code_in_MaxConsecutiveOnes_Practice_Question_editor_and_click_the_run_button() {
		Map<String, String> specificRow = testData2.get(6);
    	String validCode = specificRow.get("ValidCode");
    	array.verifyCodeEditor(validCode);
    	array.arrayPythonTextEditRun();
		}

	@Then("The user should able to see Max Consecutive Ones Practiece Questions output in the console")
	public void the_user_should_able_to_see_Max_Consecutive_Ones_Practiece_Questions_output_in_the_console() {
		Map<String, String> specificRow = testData2.get(6);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutput();
        assertEquals(expectedOutput,codeOutput);
		}
	
	
	@When("The user write the valid Max Consecutive Ones code in Editor and Click the Submit Button")
	public void the_user_write_the_valid_code_in_MaxConsecutiveOnes_Practice_Question_editor_and_click_the_submit_button() {
		Map<String, String> specificRow = testData2.get(6);
    	String validCode = specificRow.get("ValidCode");
    	array.verifyCodeEditor(validCode);
    	array.arrayPracticeSubmit();
		}
	
	
	@When("The user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_Find_Numbers_with_Even_Number_of_Digits_link() throws InterruptedException
	{
	Thread.sleep(2000);
	
	array.findNumwithEvenDigitsPractieceQue();
	}
	

	@Given("The user is on the Find Numbers with Even Number of Digits practice question editor")
	public void the_user_is_on_the_Find_Numbers_with_Even_Number_of_Digits_practice_question_editor() {
		array.arrayPythonLink();
		array.arrayPractieceQue();
		array.findNumwithEvenDigitsPractieceQue();
	}
	@When("The user write the valid Find Numbers with Even Number of Digits and Click the Run Button")
	public void the_user_write_the_valid_code_in_Find_Even_Number_of_Digits_Practice_Question_editor_and_click_the_run_button() {
		Map<String, String> specificRow = testData2.get(8);
    	String validCode = specificRow.get("ValidCode");
    	array.verifyCodeEditor(validCode);
    	array.arrayPythonTextEditRun();
		}

	@Then("The user should able to see Find Numbers with Even Number of Digits Practiece Questions output in the console")
	public void the_user_should_able_to_see_Find_with_even_Numbers_Practiece_Questions_output_in_the_console() {
		Map<String, String> specificRow = testData2.get(8);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutput();
        assertEquals(expectedOutput,codeOutput,"Output is blank when clicked on run");
		}
	
	
	@Then("The user is not able to see success message Submission successful in Find Numbers with Even Number of Digits output")
	public void the_user_should_able_to_see_Find_Numbers_with_Even_Number_of_Digits_s_output_in_the_console() {
		Map<String, String> specificRow = testData2.get(8);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyOutput();
        assertEquals(expectedOutput,codeOutput);
       }
	
	@When("The user write the valid Find Numbers with Even Number of Digits and Click the Submit Button")
	public void the_user_write_the_valid_code_in_Find_Even_Number_of_Digits_Practice_Question_editor_and_click_the_Submit_button() {
		Map<String, String> specificRow = testData2.get(8);
    	String validCode = specificRow.get("ValidCode");
    	
    	array.verifyCodeEditor(validCode);
    	array.arrayPracticeSubmit();
		}

	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_Squares_of_Sorted_array_link() throws InterruptedException
	{
	Thread.sleep(2000);
	 array.squaresOfSortedArrayPractieceQue();
	}

	
	@When("The user write the valid Squares of a Sorted Array code in Editor and Click the Submit Button")
	public void the_user_write_the_valid_code_in_SquaresOfSortedArray_Practice_Question_editor_and_click_the_submit_button() {
		Map<String, String> specificRow = testData2.get(11);
    	String validCode = specificRow.get("ValidCode");
    	array.verifyCodeEditor(validCode);
    	array.arrayPracticeSubmit();
		}
	@Then("The user is not able to see success message Submission successful for Squares of a Sorted Array code")
	public void the_user_is_not_able_to_see_Submission_success_message_for_SquaresofSortedArray_code() {
		Map<String, String> specificRow = testData2.get(11);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyBlankOutputError();
        assertEquals(expectedOutput,codeOutput, "Test Case Failed : Expected and Actual results are not matching");
      }
	
	@When("The user write the valid Squares of a Sorted Array code in Editor and Click the Run Button")
	public void the_user_write_the_valid_code_in_SquaresOfSortedArray_Practice_Question_editor_and_click_the_Run_button() {
		Map<String, String> specificRow = testData2.get(10);
    	String validCode = specificRow.get("ValidCode");
    	array.verifyCodeEditor(validCode);
    	array.arrayPythonTextEditRun();    	
		}
	
	@Then("The user should able to see Squares of a Sorted Array output in the console")
	public void the_user_should_able_to_see_Squares_of_a_Sorted_Arrayoutput_in_the_console() {

	}

	@Given("The user is on the Squares of a Sorted Array practice question editor")
	public void the_user_is_on_the_Squares_of_sorted_array_practice_question_editor() {
		array.applicationOfArraryLink();
		array.arrayPractieceQue();
		array.squaresOfSortedArrayPractieceQue();
	}

	@When("The user Clicks the Submit Button without entering any code in Editor")
	public void the_user_clicks_the_submit_button_without_entering_any_code_in_editor() {
	Map<String, String> specificRow = testData2.get(5);
	String invalidCode = specificRow.get("InvalidCode");
	array.verifyCodeEditor(invalidCode);
	array.arrayPracticeSubmit();
	}
	
	@Then("The user should be able to see error message No tests were Collected")
	public void the_user_is_able_to_see_error_message_No_tests_were_Collected() {
		Map<String, String> specificRow = testData2.get(5);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = array.verifyBlankOutputError();
        assertEquals(expectedOutput,codeOutput,"Test Case Failed : Expected output is not matching with Actual output");
     }

	

	@When("The user clicks Arrays in Python link of the Arrays page left side menu")
	public void the_user_clicks_arrays_in_Python_link_of_the_arrays_topics_page_left_side_menu() {
		array.arrayUsingList();
		array.arrayInPythonfromLeftMenu();
	}

}