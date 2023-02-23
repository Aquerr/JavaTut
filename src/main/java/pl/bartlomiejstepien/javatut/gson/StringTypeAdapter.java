//package pl.bartlomiejstepien.javatut.gson;
//
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonParseException;
//import com.google.gson.TypeAdapter;
//import com.google.gson.stream.JsonReader;
//import com.google.gson.stream.JsonToken;
//import com.google.gson.stream.JsonWriter;
//
//import java.io.IOException;
//import java.lang.reflect.Type;
//
//public class StringTypeAdapter extends TypeAdapter<String>
//{
//    @Override
//    public void write(JsonWriter out, String value) throws IOException
//    {
//        if (value == null)
//        {
//            out.nullValue();
//            return;
//        }
//
//        out.value(value);
//    }
//
//    @Override
//    public String read(JsonReader in) throws IOException
//    {
//        if (in.peek() == JsonToken.NULL)
//        {
//            in.nextNull();
//            return null;
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        while (in.hasNext() && !in.peek().name().equals("END_DOCUMENT"))
//        {
//            stringBuilder.append(in.nextString());
//        }
//        return stringBuilder.toString();
//    }
//
////    @Override
////    public String deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException
////    {
////        String text = jsonElement.getAsString();
////        return text;
////    }
//}
