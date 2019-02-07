
//Actuadores
int pinLed3 = 3;


//Sensores
int ApinLDR0 = 0;
int medLDR0 = 0;

//Instrucciones
int pwmLed3 = 0;


void setup(){
pinMode(pinLed3, OUTPUT);

}

void loop(){

medLDR0 = analogRead(ApinLDR0);
pwmLed3 = medLDR0/4;
analogWrite(pinLed3, pwmLed3);	
	

}

