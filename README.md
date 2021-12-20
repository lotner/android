я пересылаю int mark из Test1 в Test1_1 через  Intent intent = new Intent(Test1.this, Test1_1.class);
                                               intent.putExtra("mark", mark);
                                               startActivity(intent); (строка 69)
в Test1_1 я получаю mark через Intent mIntent = getIntent();
                               int mark = mIntent.getIntExtra("mark", 0); (строка 58)
из Test1_1 я его пересылаю в Test1_2, там получаю и так вплоть до Test1_20. там я подсчитываю итоговые баллы и вывожу соответствующее диалоговое окно
оно пересылает и все работает, но пересылает оно defaultValue, то есть ноль, а хотелось бы все-таки получить настоящее число из предыдущего activity
