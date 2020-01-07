  public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int month;
    private int year;
    private int day;

      public HeartRates(String firstName, String lastName, String dateOfBirth, int month, int year, int day) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.dateOfBirth = dateOfBirth;
          this.month = month;
          this.year = year;
          this.day = day;
      }



      public String getFirstName() {
      return firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public String getDateOfBirth() {
      return dateOfBirth;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
    }
    public void setday(int day) {
          this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setYear(int year) {
          this.year = year;
    }
    public int getYear() {
          return year;
    }
    public void setMonth(int month) {
          this.month = month;
    }
    public int getMonth() {
          return month;
    }
  

      public int displayAge() {
          int year2 = 2020;
          year2 - this.year = displayAge() {
            return displayAge;
      }

      public int maximumHeartRate() {
          220 - displayAge = maximummHeartRate() {
              return maximumHeartRate;
              }
      }
      public int targetHeartRate() {
              if(targetHeartRate <= 0.85 * maximimumHeartRate()) {
                  return targetHeartRate;
              } else {
                  return false
              }
              if (targetHeartRate > 0.5 * maximumHeartRate()) {
                  return targetHeartRate;
              } else {
                  return false
              }
          }
  }