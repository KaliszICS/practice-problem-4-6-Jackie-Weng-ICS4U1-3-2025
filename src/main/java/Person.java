//* Jackie Weng Problem 4-6 */
//* J.Kalisz */

import java.util.Arrays;

public class Person {
    private String firstname;
    private String lastname;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String SSN;
    private int howmanySiblings = 0;
    private Person[] siblings;

    //* main constuctor for person */
    //* @param firstname: first name of the dude */
    //* @param lastme: last name of the dude */
    //* @param birthyear:  the year the dude was born  */
    //* @param birthmontth:  the month the dude was born  */
    //* @param birthday:  the day the dude was born  */
    //* @param SSN: the social sercuity number of the dude */
    public Person (String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String son) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.SSN = SSN;
        this.howmanySiblings = 0;
        this.siblings = new Person[0];
    }

    //* @return: the first name of the person */
    public String getFirstname() {
        return firstname;
    }

//* @param firstname: firstname of the dude */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
//* @return return last of the dude */
    public String getLastname() {
        return lastname;
    }
//* @param: the new last name of the dude */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
//* @return: return the dudes birthday in day/month/year. my birthday of december 6th 2007 would be 06/12/2007 in this format */
    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }
//* @param: the "person" object you add as a sibling. */
    public void addSibling(Person sibling) {
        Person[] newSiblings = Arrays.copyOf(this.siblings, this.siblings.length + 1);
        newSiblings[newSiblings.length - 1] = sibling;
        this.siblings = newSiblings;
        this.howmanySiblings++;
    }


//* @return: the array of siblings */
     public Person[] getSiblings() {
        return Arrays.copyOf(this.siblings, this.siblings.length);
    }

}