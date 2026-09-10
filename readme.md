# equation

Implementations of various equations I use for simulation and modeling.

## ddxyay

A solver for 

```
(d/dx)y = ay
y(0) = y0
```

## ddxyxexq

A solver for 

```
(d/dx)y = x e^(x^2)
y(0) = y0
```

## agdypddxygln

A solver for

```
a/y(x) + (d/dx)y(x) = 0
y(0)=y0
```

e.g.

```
x = [0,80]
a = 100
y0 = 90

[0.0, 100.0]
[10.0, 90.55385138137417]
[20.0, 80.0]
[30.0, 67.82329983125268]
[40.0, 52.91502622129181]
[50.0, 31.622776601683793]
[60.0, NaN]
[70.0, NaN]
```

# ddxyxcosx

A solver for

```
(d/dx)y = xcos(x)
y(0) = y0
```

e.g.

```
y(0)=200

[0.0, 200.0]
[3.0, 198.43336752757915]
[6.0, 198.28367729745682]
[9.0, 201.79793610529114]
```
