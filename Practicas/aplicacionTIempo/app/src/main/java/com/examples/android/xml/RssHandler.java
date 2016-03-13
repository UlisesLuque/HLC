package com.examples.android.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RssHandler extends DefaultHandler {
    private Noticia noticia;
    private StringBuilder sbTexto;

    public Noticia getNoticia(){
        return noticia;
    }
 
    @Override
    public void characters(char[] ch, int start, int length)
                   throws SAXException {
 
        super.characters(ch, start, length);
 
        if (this.noticia != null)
        	sbTexto.append(ch, start, length);
    }
 
    @Override
    public void endElement(String uri, String localName, String name)
                   throws SAXException {
        if (localName.equalsIgnoreCase("country")){
            noticia.setCountry(sbTexto.toString());
        }
        super.endElement(uri, localName, name);

    }
 
    @Override
    public void startDocument() throws SAXException {
 
        super.startDocument();
        sbTexto = new StringBuilder();
        noticia = new Noticia();
    }
 
    @Override
    public void startElement(String uri, String localName,
                   String name, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, name, attributes);

        if (this.noticia != null) {
            if (localName.equalsIgnoreCase("city")) {
                String cityName = attributes.getValue("name");
                noticia.setCityName(cityName);
            } else if (localName.equalsIgnoreCase("coord")) {
                String lon = attributes.getValue("lon");
                noticia.setCoordLon(lon);
                String lat = attributes.getValue("lat");
                noticia.setCoordLat(lat);
            } else if (localName.equalsIgnoreCase("sun")) {
                String rise = attributes.getValue("rise");
                noticia.setSunRise(rise);
                String set = attributes.getValue("set");
                noticia.setSunSet(set);
            } else if (localName.equalsIgnoreCase("temperature")) {
                String temValue = attributes.getValue("value");
                noticia.setTemperatureValue(temValue);
                String temMin = attributes.getValue("min");
                noticia.setTemperatureMin(temMin);
                String temMax = attributes.getValue("max");
                noticia.setTemperatureMax(temMax);
                String temUnit = attributes.getValue("unit");
                noticia.setTemperatureUnit(temUnit);
            } else if (localName.equalsIgnoreCase("humidity")) {
                String humidityValue = attributes.getValue("value");
                noticia.setHumidityValue(humidityValue);
                String humidityUnit = attributes.getValue("unit");
                noticia.setHumidityUnite(humidityUnit);
            } else if (localName.equalsIgnoreCase("pressure")) {
                String pressureValue = attributes.getValue("value");
                noticia.setPressureValue(pressureValue);
                String pressureUnit = attributes.getValue("unit");
                noticia.setPressureUnit(pressureUnit);
            } else if (localName.equalsIgnoreCase("speed")) {
                String speedValue = attributes.getValue("value");
                noticia.setWindSpeedValue(speedValue);
                String speedName = attributes.getValue("name");
                noticia.setWindSpeedName(speedName);
            } else if (localName.equalsIgnoreCase("direction")) {
                String directionValue = attributes.getValue("value");
                noticia.setWindDirectionValue(directionValue);
                String directionCode = attributes.getValue("code");
                noticia.setWindDirectionCode(directionCode);
                String directionName = attributes.getValue("name");
                noticia.setWindDirectionName(directionName);
            } else if (localName.equalsIgnoreCase("clouds")) {
                String cloudsValue = attributes.getValue("value");
                noticia.setCloudsValue(cloudsValue);
                String cloudsName = attributes.getValue("name");
                noticia.setCloudsName(cloudsName);
            } else if (localName.equalsIgnoreCase("visibility")) {
                String visibilityValue = attributes.getValue("value");
                noticia.setVisibility(visibilityValue);
            } else if (localName.equalsIgnoreCase("precipitation")) {
                String precipitation = attributes.getValue("mode");
                noticia.setPrecipitation(precipitation);
            } else if (localName.equalsIgnoreCase("weather")) {
                String weatherNumber = attributes.getValue("number");
                noticia.setWeatherValue(weatherNumber);
                String weatherValue = attributes.getValue("value");
                noticia.setWeatherValue(weatherValue);
                String weatherIcon = attributes.getValue("icon");
                noticia.setWeatherIcon(weatherIcon);
            } else if (localName.equalsIgnoreCase("lastupdate")) {
                String lastupdate = attributes.getValue("value");
                noticia.setLastupdate(lastupdate);
            }
        }
    }

}
