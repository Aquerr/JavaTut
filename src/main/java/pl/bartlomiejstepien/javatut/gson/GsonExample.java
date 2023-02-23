//package pl.bartlomiejstepien.javatut.gson;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.stream.JsonReader;
//
//import java.util.Arrays;
//import java.util.List;
//
////public class GsonExample
////{
////    public static void main(String[] args)
////    {
////        String emptyString = "";
////        String spaceString = " ";
////        String stringWithNumber = "1";
////        String longPlainText = "Moja Szkoda 22.05";
////        List<String> texts = Arrays.asList(emptyString, spaceString, stringWithNumber, longPlainText);
////
////        Gson gson = new GsonBuilder()
////                .setLenient()
////                .registerTypeAdapter(String.class, new StringTypeAdapter())
////                .create();
////
////        for (String text : texts)
////        {
////            System.out.println("Text to convert: '" + text + "'");
////            String result = gson.fromJson(text, String.class);
////            System.out.println("Result: '" + result + "'");
////        }
////    }
////}
