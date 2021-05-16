package com.company;


    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
           /* if (age > 0) {
                this.age = age;

            } else {
                this.age = 0;
            }
        }

            */
            this.age = age;
        }

        public String getName() {
            return "";
        }

        public int getAge() {
            return this.age;

        }

        public void setName(String name) {
            this.name=name;

        }

        public void setAge(int age) {
          /*  if (age > 0) {
                this.age = age;
            } else
                this.age = 0;
        }

           */
            this.age = age;
        }

        public String reversename(String name) {
      /* char[] try1=name.toCharArray();
       for(int i=try1.length-1; i>=0;i--){
           System.out.println(try1[i]);
       }

       */
      return name;
        }


    }







