
# Loan Amortization Schedule

## Overview

This Java program calculates and displays a loan amortization schedule. It reads loan details (amount, term, and interest rate) from the user, calculates the monthly payment, total payment, and breaks down the interest, principal, and remaining balance for each payment.

---

## Features

### Input Details
- **Loan Amount:** Total loan to be amortized.
- **Number of Years:** Loan term in years.
- **Annual Interest Rate:** Interest rate applied annually.

### Calculations
- **Monthly Interest Rate:** Derived from the annual interest rate.
- **Monthly Payment:** Based on the loan amount, interest rate, and term.
- **Total Payment:** Total amount paid over the loan term.

### Output
- **Amortization Schedule:** Displays for each payment:
  - Payment number
  - Interest portion
  - Principal portion
  - Remaining balance

---

## Code Details

### Main Class: `IT161Final_JL`
The `main` method is the entry point for the program and performs the following steps:
1. Prompts the user for loan details (amount, term, and interest rate).
2. Calculates monthly and total payments.
3. Displays the loan amortization schedule.

#### Key Variables
- `dblLoanAmount`: Loan amount entered by the user.
- `intYears`: Loan term in years.
- `dblAnnualInterestRate`: Annual interest rate.
- `dblMonthlyRate`: Monthly interest rate derived from annual rate.
- `dblMonthlyPayment`: Monthly payment amount.
- `dblRemainingBalance`: Loan balance after each payment.

### Helper Methods
1. **`ReadFloatFromUser`:**
   - Reads and returns a float value entered by the user.
2. **`ReadIntegerFromUser`:**
   - Reads and returns an integer value entered by the user.

### Sample Output
```plaintext
Your Name – Loan Amortization Schedule
Class – IT-161-###

Enter Loan Amount: 10000
Enter Number of Years: 5
Enter Annual Interest Rate: 5

Monthly Payment: 188.71
Total Payment: 11322.74

Payment#     Interest     Principal     Balance
1            41.67        147.04       9852.96
2            41.05        147.66       9705.30
...
60           0.78         187.93       0.00
```

---

## How to Run

1. **Compile the program:**
   ```bash
   javac IT161Final_JL.java
   ```
2. **Run the program:**
   ```bash
   java IT161Final_JL
   ```

---

## License

This project is for educational purposes only and is not intended for production use.
