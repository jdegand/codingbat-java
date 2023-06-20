public String alarmClock(int day, boolean vacation) {
    if(day != 0 && day != 6 && !vacation){
      return "7:00";
    } else if(vacation && (day == 0 || day == 6 )){
      return "off";
    } else if(vacation && (day != 0 || day != 6 )){
      return "10:00";
    } else {
      return "10:00";
    }
}
  