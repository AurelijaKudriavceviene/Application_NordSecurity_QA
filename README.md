# Automation Test for Job Title Search

## Overview

This project contains an automated test designed to identify and demonstrate a bug encountered on a job search website. The bug involves inconsistencies in displaying job titles when specific search terms are used.

## Bug Description

When searching for job titles using certain keywords (e.g., "Mid Manual QA Engineer", "Junior Quality Assurance"), the search results may not accurately reflect the available positions, even though relevant jobs exist on the website.

## Test Scenario

The automated test simulates the following steps:

1.  Navigates to the website's careers page.
2.  Enters a specific job title into the search bar.
3.  Validates that the search results accurately reflect the available positions.

## How to Run the Test

1.  Clone the repository.
2.  Open the project in your preferred IDE.
3.  Execute the `JuniorQAPositionTest` class.

## Expected Result

The test is designed to fail, highlighting the presence of the bug. This is because the expected job titles are not consistently displayed in the search results.

## Additional Notes

*   The test uses Selenium WebDriver for browser automation.
*   The test data (job titles) is parameterized to allow for easy modification and expansion.

## Contributing

If you find any additional issues or have suggestions for improvement, feel free to open an issue or submit a pull request.
