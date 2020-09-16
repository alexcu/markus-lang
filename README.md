MarkusLang
==========

![Deal with it](https://i.imgur.com/KcroNqp.gif)

A basic language made up of Markus Lumpe quotes. More to come soon (hopefully!)

Written using JavaCC.

## Basics

### Assignment Statements
Assign values, either strings or numbers, to a variable name using `this little piggy [var] is [val]`.

- **Strings** are encapsulated using single quotes: `'Hello, Markus!'`
- **Variables** can only contain lowercase letters separated with underscores: `swin_lsd`
- **Numbers** are described using the IEEE standard for floating-point values

For example, `var ice_teas = 1` would translate to `this little piggy ice_teas is 1`.

### Print Statements
Print the value of a *variable* by providing its name to the statement `what is this thingy [var]?`. Can only print variables that have been stored.

For example, `puts x` would translate to `what is this thingy x?`

You can also print out the current machine memory by using a double `?` in the `what is this thingy` statement, i.e. `what is this thingy??`

If you print a variable that has not been bound, you will get an `everything is not peachy` runtime error.

### Commenting
Use hashes to comment out a line of code.

### Coming Soon...

- If statments,
- loops,
- arrays,
- functions/procedures,
- and more quotes!

## Sample Code

````
# "Hello, Markus" in MarkusLang
i am the dictator
  this little piggy message is 'Hello, Markus!'
  what is this thingy message?
everything is peachy

````

## Disclaimer

You probably won't get any of this if you never did [LSD](http://www.future.swinburne.edu.au/units/Languages-in-Software-Development-HIT3315/local) at Swinburne ;)
