public class MultiLineAddress {
        public static void main(String[] args) {
            // Define address components
            String street = "123 Elm Street";
            String city = "Springfield";
            String zipCode = "12345";

            // Format the address using new lines and tabs
            String Address = "Address:\n"+ "\t" + street + ","+"\n" + "\t" + city + ", " + zipCode;

            // Print the formatted address
            System.out.println(Address);
        }
    }


