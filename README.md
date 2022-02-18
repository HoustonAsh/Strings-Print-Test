# Just a Strings Print Test for Java
The test: function that prints 10^5 words with various of methods.  
For my pc (Ryzen 2600, 3.4GHz) i got that results

| Print method                                | time in ms |
| ------------------------------------------- |------------|
|stem.out.println                             | 77585      |
|BufferedWriter                               | 588        |
|BufferedOutputStream                         | 590        |
|String Builder with System.out.println       | 588        |
|BufferedWriter with System.out.println       | 584        |
|BufferedOutputStream with System.out.println | 487        |
