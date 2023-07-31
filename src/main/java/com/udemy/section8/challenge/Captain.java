package com.udemy.section8.challenge;

public class Captain {

        private int data=0;

        private Captain() {
        }

        public static Captain getInstance(){
            return SingletonHelper.uniqueInstance;
        }

        private static class SingletonHelper{
            private static final Captain uniqueInstance = new Captain();
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

}
