package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
tiff	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TIFFField	TokenNameIdentifier
implements	TokenNameimplements
Comparable	TokenNameIdentifier
,	TokenNameCOMMA
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_BYTE	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_ASCII	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_SHORT	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_LONG	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_RATIONAL	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_SBYTE	TokenNameIdentifier
=	TokenNameEQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_UNDEFINED	TokenNameIdentifier
=	TokenNameEQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_SSHORT	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_SLONG	TokenNameIdentifier
=	TokenNameEQUAL
9	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_SRATIONAL	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_FLOAT	TokenNameIdentifier
=	TokenNameEQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TIFF_DOUBLE	TokenNameIdentifier
=	TokenNameEQUAL
12	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
tag	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
type	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
data	TokenNameIdentifier
;	TokenNameSEMICOLON
TIFFField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
TIFFField	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
tag	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
type	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
count	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
data	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
tag	TokenNameIdentifier
=	TokenNameEQUAL
tag	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
type	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
=	TokenNameEQUAL
count	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
data	TokenNameIdentifier
=	TokenNameEQUAL
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getTag	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
tag	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsChars	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsShorts	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsInts	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsLongs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsFloats	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsDoubles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsSRationals	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsRationals	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getAsInt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
TIFF_BYTE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
TIFF_UNDEFINED	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SBYTE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SHORT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xffff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SSHORT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SLONG	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
ClassCastException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getAsLong	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
TIFF_BYTE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
TIFF_UNDEFINED	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SBYTE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SHORT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xffff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SSHORT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SLONG	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_LONG	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
ClassCastException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getAsFloat	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
TIFF_BYTE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SBYTE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SHORT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xffff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SSHORT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SLONG	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_LONG	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_FLOAT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_DOUBLE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SRATIONAL	TokenNameIdentifier
:	TokenNameCOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ivalue	TokenNameIdentifier
=	TokenNameEQUAL
getAsSRational	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
ivalue	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
/	TokenNameDIVIDE
ivalue	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_RATIONAL	TokenNameIdentifier
:	TokenNameCOLON
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lvalue	TokenNameIdentifier
=	TokenNameEQUAL
getAsRational	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
lvalue	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
/	TokenNameDIVIDE
lvalue	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
ClassCastException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getAsDouble	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
TIFF_BYTE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SBYTE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SHORT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xffff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SSHORT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SLONG	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_LONG	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_FLOAT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_DOUBLE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_SRATIONAL	TokenNameIdentifier
:	TokenNameCOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ivalue	TokenNameIdentifier
=	TokenNameEQUAL
getAsSRational	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
ivalue	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
/	TokenNameDIVIDE
ivalue	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
case	TokenNamecase
TIFF_RATIONAL	TokenNameIdentifier
:	TokenNameCOLON
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lvalue	TokenNameIdentifier
=	TokenNameEQUAL
getAsRational	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
lvalue	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
/	TokenNameDIVIDE
lvalue	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
ClassCastException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getAsString	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsSRational	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAsRational	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
oTag	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
TIFFField	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getTag	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tag	TokenNameIdentifier
<	TokenNameLESS
oTag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
tag	TokenNameIdentifier
>	TokenNameGREATER
oTag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE