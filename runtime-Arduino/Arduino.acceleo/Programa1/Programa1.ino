
//Actuadores
int pinLed1= 1;
int pinLed13= 13;
int pinLed4= 4;
int pinLed0= 0;

//Sensores
int ApinLDR5 = 5;
int medLDR5 = 0;
int ApinLDR1 = 1;
int medLDR1 = 0;

//Instrucciones
int pwmLed1=0;
int pwmLed4=0;
int milisegLed13 = 2;
int milisegLed0 = 0;


void setup(){
pinMode(pinLed1, OUTPUT);

pinMode(pinLed13, OUTPUT);
digitalWrite(pinLed13, LOW);
pinMode(pinLed4, OUTPUT);

pinMode(pinLed0, OUTPUT);
digitalWrite(pinLed0, LOW);
}

void loop(){

digitalWrite(pinLed13, HIGH);
delay(milisegLed13);
digitalWrite(pinLed13, LOW);
delay(milisegLed13);

digitalWrite(pinLed0, HIGH);
delay(milisegLed0);
digitalWrite(pinLed0, LOW);
delay(milisegLed0);

medLDR5 = analogRead(ApinLDR5);
pwmLed1 = medLDR5/4;
analogWrite(pinLed1, pwmLed1);
				
medLDR1 = analogRead(ApinLDR1);
pwmLed4 = medLDR1/4;
analogWrite(pinLed4, pwmLed4);
				

}

