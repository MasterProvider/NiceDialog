# NiceDialog
Nice Dialog is a custom design dialog for netbeans

# Demo
  ![demo](https://user-images.githubusercontent.com/48547307/113206552-2d760a80-92a2-11eb-995c-a5a9a1ebec4a.gif)


## Setup
Add  NiceDialog.jar to your Libraries

## Usage

 A basic display message:

    NiceDialog niceDialog =  new NiceDialog();
               niceDialog.setTitleText("INFO");
               niceDialog.setDescriptionText("Nice Dialog a custom dialog for netbeans"); 
               niceDialog.display();
              
 A success display message:

    NiceDialog niceDialog =  new NiceDialog(SUCCESS_TYPE);
               niceDialog.setTitleText("SUCCESS");
               niceDialog.setDescriptionText("Nice Dialog a custom dialog for netbeans");
               niceDialog.display();
               
 A warning display message:
 
    NiceDialog niceDialog =  new NiceDialog(WARNING_TYPE);
               niceDialog.setTitleText("WARNING");
               niceDialog.setDescriptionText("Nice Dialog a custom dialog for netbeans");
               niceDialog.display();
               
  A error display message：
   
    NiceDialog niceDialog =  new NiceDialog(ERROR_TYPE);
               niceDialog.setTitleText("ERROR");
               niceDialog.setDescriptionText("Nice Dialog a custom dialog for netbeans");
               niceDialog.display();
               
   Bind the listener to confirm button
   
    NiceDialog niceDialog =  new NiceDialog(ERROR_INFO);
               niceDialog.setTitleText("Change Type  Dialog");
               niceDialog.setDescriptionText("Nice Dialog a custom dialog for netbeans");
               niceDialog.setConfirmListener(new NiceDialog.OnActionListener() {
                      @Override
                      public void actionPerformed(NiceDialog nDialog) {
                              niceDialog.changeAlertType(SUCCESS_TYPE);
                              
                      }
               })
               .display();
               
   Bind the listener to cancel button
    
     NiceDialog niceDialog =  new NiceDialog(ERROR_INFO);
               niceDialog.setTitleText("Cancel me");
               niceDialog.setDescriptionText("Nice Dialog a custom dialog for netbeans");
               niceDialog.setCancelListener(new NiceDialog.OnActionListener() {
                      @Override
                      public void actionPerformed(NiceDialog nDialog) {
                              niceDialog.dismiss();
                              
                      }
               })
               .display();
              
   ## License
       MIT License

        Copyright (c) 2020 Federico Patricio Jr.

        Permission is hereby granted, free of charge, to any person obtaining a copy
        of this software and associated documentation files (the "Software"), to deal
        in the Software without restriction, including without limitation the rights
        to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
        copies of the Software, and to permit persons to whom the Software is
        furnished to do so, subject to the following conditions:

        The above copyright notice and this permission notice shall be included in all
        copies or substantial portions of the Software.

        THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
        IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
        FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
        AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
        LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
        OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
        SOFTWARE.
    
