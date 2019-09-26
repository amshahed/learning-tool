int a=A0, b=A1, c=A2, d=A3, e=A4;
int thumb, index, middle, ring, little;

void setup(){
  Serial.begin(9600);
}

void loop(){
  thumb = analogRead(a);
  index = analogRead(b);
  middle = analogRead(c);
  ring = analogRead(d);
  little = analogRead(e);

  thumb = map(thumb, 700, 900, 1, 300);
  index = map(index, 510, 750, 1, 300);
  middle = map(middle, 500, 820, 1, 300);
  ring = map(ring, 470, 780, 1, 300);
  little = map(little, 730, 960, 1, 300);

  Serial.print('>');
  Serial.print(thumb); Serial.print(' ');
  Serial.print(index); Serial.print(' ');
  Serial.print(middle); Serial.print(' ');
  Serial.print(ring); Serial.print(' ');
  Serial.print(little); Serial.println('<');

  if (thumb>=70 && thumb<=170 && index>=100 && index<=180 && middle>=167 && middle<=197 && ring>=119 && ring<=160 && little>=97 && little<=200)
    Serial.println("shoreo");
  if (thumb>=25 && thumb<=70 && index>=23 && index<=53 && middle>=33 && middle<=63 && ring>=25 && ring<=55 && little>=46 && little<=86)
    Serial.println("shorea");
  if (thumb>=40 && thumb<=200 && index>=120 && index<=160 && middle>=200 && middle<=243 && ring>=200 && ring<=243 && little>=200 && little<=240)
    Serial.println("short e");
  if (thumb>=40 && thumb<=150 && index>=43 && index<=80 && middle>=200 && middle<=240 && ring>=200 && ring<=241 && little>=200 && little<=240)
    Serial.println("short u");
    if (thumb>=100 && thumb<=173 && index>=50 && index<=100 && middle>=50 && middle<=120 && ring>=170 && ring<=220 && little>=180 && little<=220)
    Serial.println("hrii");
  if (thumb>=26 && thumb<=76 && index>=220 && index<=260 && middle>=240 && middle<=272 && ring>=210 && ring<=238 && little>=199 && little<=240)
    Serial.println("ae");
  if (thumb>=30 && thumb<=77 && index>=200 && index<=230 && middle>=200 && middle<=252 && ring>=170 && ring<=210 && little>=90 && little<=150)
    Serial.println("oi");
  if (thumb>=132 && thumb<=170 && index>=160 && index<=200 && middle>=220 && middle<=260 && ring>=170 && ring<=208 && little>=160 && little<=190)
    Serial.println("o");
  if (thumb>=120 && thumb<=160 && index>=160 && index<=200 && middle>=220 && middle<=260 && ring>=170 && ring<=200 && little>=130 && little<=160)
    Serial.println("ou");
  if (thumb>=155 && thumb<=175 && index>=175 && index<=215 && middle>=205 && middle<=235 && ring>=190 && ring<230 && little>=170 && little<=200)
    Serial.println("ko");
  if (thumb>=15 && thumb<=75 && index>=185 && index<=225 && middle>=205 && middle<=245 && ring>=195 && ring<=235 && little>=195 && little<=235)
    Serial.println("kho");
  if (thumb>=40 && thumb<=100 && index>=95 && index<=135 && middle>=170 && middle<=210 && ring>=90 && ring<=130 && little>=105 && little<=145)
    Serial.println("go");
  if (thumb>=130 && thumb<=170 && index>=130 && index<=170 && middle>=210 && middle<=250 && ring>=195 && ring<=235 && little>=195 && little<=235)
    Serial.println("gho");
  if (thumb>=20 && thumb<=80 && index>=205 && index<=245 && middle>=90 && middle<=130 && ring>=45 && ring<=85 && little>=55 && little<=95)
    Serial.println("umo");
  if (thumb>=130 && thumb<=190 && index>=170 && index<=230 && middle>=100 && middle<=160 && ring>=45 && ring<=105 && little>=45 && little<=105)
    Serial.println("cho");
  if (thumb>=140 && thumb<=200 && index>=30 && index<=90 && middle>=190 && middle<=250 && ring>=155 && ring<=215 && little>=60 && little<=120)
    Serial.println("chho");
  if (thumb>=140 && thumb<=220 && index>=160 && index<=230 && middle>=210 && middle<=270 && ring>=160 && ring<=230 && little>=190 && little<=230)
    Serial.println("jo");
  if (thumb>=0 && thumb<=70 && index>=0 && index<=60 && middle>=25 && middle<=85 && ring>=155 && ring<=215 && little>=130 && little<=190)
    Serial.println("jho");
  if (thumb>100 && thumb<=160 && index>=145 && index<=205 && middle>=140 && middle<=200 && ring>=65 && ring<=135 && little>=95 && little<=155)
    Serial.println("neo");
  if (thumb>=100 && thumb<=140 && index>=165 && index<=195 && middle>=210 && middle<=230 && ring>=195 && ring<=235 && little>=185 && little<=215)
    Serial.println("tto");
  if (thumb>=45 && thumb<=105 && index>=50 && index<=110 && middle>=185 && middle<=245 && ring>=190 && ring<=250 && little>=190 && little<=250)
    Serial.println("ttho");
  if (thumb>=30 && thumb<=100 && index>=40 && index<=100 && middle>=70 && middle<=130 && ring>=170 && ring<=230 && little>=160 && little<=220)
    Serial.println("ddo");
  if (thumb>=135 && thumb<=195 && index>=50 && index<=110 && middle>=190 && middle<=205 && ring>=145 && ring<=205 && little>=160 && little<=230)
    Serial.println("ddho");
  if (thumb>=80 && thumb<=150 && index>=120 && index<=180 && middle>=155 && middle<=215 && ring>=55 && ring<=115 && little>=30 && little<=90)
    Serial.println("no");
  if (thumb>=180 && thumb<=210 && index>=170 && index<=230 && middle>=190 && middle<=250 && ring>=195 && ring<=255 && little>=200 && little<=260)
    Serial.println("to");
  if (thumb>=15 && thumb<=75 && index>=5 && index<=65 && middle>=165 && middle<=225 && ring>=185 && ring<=245 && little>=180 && little<=240)
    Serial.println("tho");
  if (thumb>=10 && thumb<=80 && index>=170 && index<=230 && middle>=185 && middle<=245 && ring>=195 && ring<=255 && little>=190 && little<=250)
    Serial.println("do");
  if (thumb>=135 && thumb<=195 && index>=175 && index<=235 && middle>=205 && middle<=265 && ring>=190 && ring<=250 && little>=195 && little<=255)
    Serial.println("dho");
  if (thumb>=140 && thumb<=210 && index>=30 && index<=90 && middle>=40 && middle<=100 && ring>=115 && ring<=175 && little>=145 && little<=205)
    Serial.println("po");
  if (thumb>=165 && thumb<=225 && index>=190 && index<=250 && middle>=85 && middle<=145 && ring>=10 && ring<=70 && little>=30 && little<=90)
    Serial.println("pho");
  if (thumb>=210 && thumb<=280 && index>=30 && index<=90 && middle>=85 && middle<=145 && ring>=30 && ring<=90 && little>=10 && little<=70)
    Serial.println("bo");
  if (thumb>=140 && thumb<=200 && index>=40 && index<=100 && middle>=95 && middle<=155 && ring>=80 && ring<=140 && little>=125 && little<=185)
    Serial.println("mo");
  if (thumb>=0 && thumb<=70 && index>=15 && index<=75 && middle>=175 && middle<=235 && ring>=195 && ring<=255 && little>=180 && little<=230)
    Serial.println("lo");
  if (thumb>=210 && thumb<=270 && index>=200 && index<=260 && middle>=215 && middle<=275 && ring>=205 && ring<=265 && little>=190 && little<=230)
    Serial.println("sho");
  if (thumb>=180 && thumb<=230 && index>=5 && index<=75 && middle>=60 && middle<=120 && ring>=180 && ring<=240 && little>=170 && little<=230)
    Serial.println("ho");
  if (thumb>=70 && thumb<=130 && index>=40 && index<=100 && middle>=185 && middle<=245 && ring>=200 && ring<=260 && little>=170 && little<=230)
    Serial.println("onu");
  if (thumb>=10 && thumb<=80 && index>=60 && index<=130 && middle>=190 && middle<=250 && ring>=195 && ring<=255 && little>=185 && little<=245)
    Serial.println("bindu");
  
  
  delay(400);
}
