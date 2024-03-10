
  Feature: validate amazon web page
    @amazon1
      #before
    Scenario: serach result validation
      Given select categery in homepage

          @am02
            #before
         Scenario: mouse acctions
        Given user navigate to baby wishlist page

@DragandDrop
Scenario:
  Given user handle the drag and drop


   @amazonTitleValidation
  Scenario: user verify the title
    Given user enter the productname
    Then validate the title of searchresult page

     @amazonPageObjects
     Scenario: login
       Given user enter credi
      Then  validate errormassage

@cons
  Scenario: constr Example
    Given sample



