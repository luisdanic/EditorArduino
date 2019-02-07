
//Actuadores
int pinLed13 = 13;


//Sensores

//Instrucciones
int milisegLed13 = 1000;


void setup(){
pinMode(pinLed13, OUTPUT);
digitalWrite(pinLed13, LOW);

}

void loop(){

digitalWrite(pinLed13, HIGH);
delay(milisegLed13);
digitalWrite(pinLed13, LOW);
delay(milisegLed13);


}

