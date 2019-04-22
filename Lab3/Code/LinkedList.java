class LinkedList{
      public static class Node{
            public int numb;

          public int getNumb() {
              return numb;
          }

          public void setNumb(int numb) {
              this.numb = numb;
          }

          public int getFree() {
              return free;
          }

          public void setFree(int free) {
              this.free = free;
          }

          public float getDepart_time() {
              return depart_time;
          }

          public void setDepart_time(float depart_time) {
              this.depart_time = depart_time;
          }

          public float getArr_time() {
              return arr_time;
          }

          public void setArr_time(float arr_time) {
              this.arr_time = arr_time;
          }

          public String getDay() {
              return day;
          }

          public void setDay(String day) {
              this.day = day;
          }

          public String getSt_name() {
              return st_name;
          }

          public void setSt_name(String st_name) {
              this.st_name = st_name;
          }

          public int free;
            public float depart_time, arr_time;
            String day, st_name;
            Node next;

            public  Node(int numb, int free, float depart_time, float arr_time, String day, String st_name ){
                this.numb = numb;

                this.free = free;

                this.depart_time = depart_time;

                this.arr_time = arr_time;

                this.day = day;

                this.st_name = st_name;
            }
      }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int size = 0;
      Node first = null;

      public void add(int numb, int free, float depart_time, float arr_time, String day, String st_name ){
          Node curr = first;
          Node newNode = new Node(numb, free, depart_time, arr_time, day, st_name );
          if(first == null){
              first = newNode;
              newNode.next = first;
          }
          else{
              while(curr.next != first){
                  curr = curr.next;
              }
              curr.next = newNode;
              newNode.next = first;
          }
          size++;
      }


      public void print(){
          Node ptr = first;
          int count = 0;
          while(count < size){
              System.out.println("Номер рейсу:"+ptr.numb+". Назва станції:"+ptr.st_name+"\n"+"Дата прибуття:\n"+
                      "День: "+ptr.day+"; Час прибуття: "+ptr.arr_time+"; Час відбуття: "+ptr.depart_time+"\nВільних місць:"+
                      ptr.free+"\n");
              ptr = ptr.next;
              count++;
          }
      }
}

