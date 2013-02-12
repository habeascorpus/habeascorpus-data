package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ByteArrayInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStreamReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PushbackInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
EncodingUtilities	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XMLUtilities	TokenNameIdentifier
extends	TokenNameextends
XMLCharacters	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
XMLUtilities	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
c	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0x0020	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
1L	TokenNameLongLiteral
<<	TokenNameLEFT_SHIFT
0x0009	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
1L	TokenNameLongLiteral
<<	TokenNameLEFT_SHIFT
0x000A	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
1L	TokenNameLongLiteral
<<	TokenNameLEFT_SHIFT
0x000D	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
1L	TokenNameLongLiteral
<<	TokenNameLEFT_SHIFT
0x0020	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
>>	TokenNameRIGHT_SHIFT
c	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
1L	TokenNameLongLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXMLNameFirstCharacter	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
NAME_FIRST_CHARACTER	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
/	TokenNameDIVIDE
32	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
c	TokenNameIdentifier
%	TokenNameREMAINDER
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXML11NameFirstCharacter	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
NAME11_FIRST_CHARACTER	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
/	TokenNameDIVIDE
32	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
c	TokenNameIdentifier
%	TokenNameREMAINDER
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXMLNameCharacter	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
NAME_CHARACTER	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
/	TokenNameDIVIDE
32	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
c	TokenNameIdentifier
%	TokenNameREMAINDER
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXML11NameCharacter	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
NAME11_CHARACTER	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
/	TokenNameDIVIDE
32	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
c	TokenNameIdentifier
%	TokenNameREMAINDER
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXMLCharacter	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
XML_CHARACTER	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
c	TokenNameIdentifier
&	TokenNameAND
0x1F	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
c	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0x10000	TokenNameIntegerLiteral
&&	TokenNameAND_AND
c	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0x10ffff	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXML11Character	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
c	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
1	TokenNameIntegerLiteral
&&	TokenNameAND_AND
c	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0xd7ff	TokenNameIntegerLiteral
||	TokenNameOR_OR
c	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0xe000	TokenNameIntegerLiteral
&&	TokenNameAND_AND
c	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0xfffd	TokenNameIntegerLiteral
||	TokenNameOR_OR
c	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0x10000	TokenNameIntegerLiteral
&&	TokenNameAND_AND
c	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0x10ffff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXMLPublicIdCharacter	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
c	TokenNameIdentifier
<	TokenNameLESS
128	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
PUBLIC_ID_CHARACTER	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
/	TokenNameDIVIDE
32	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
c	TokenNameIdentifier
%	TokenNameREMAINDER
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXMLVersionCharacter	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
c	TokenNameIdentifier
<	TokenNameLESS
128	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
VERSION_CHARACTER	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
/	TokenNameDIVIDE
32	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
c	TokenNameIdentifier
%	TokenNameREMAINDER
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isXMLAlphabeticCharacter	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
c	TokenNameIdentifier
<	TokenNameLESS
128	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
ALPHABETIC_CHARACTER	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
/	TokenNameDIVIDE
32	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
c	TokenNameIdentifier
%	TokenNameREMAINDER
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Reader	TokenNameIdentifier
createXMLDocumentReader	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
PushbackInputStream	TokenNameIdentifier
pbis	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PushbackInputStream	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
,	TokenNameCOMMA
128	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
pbis	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
pbis	TokenNameIdentifier
.	TokenNameDOT
unread	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
0x00FF	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0x003c	TokenNameIntegerLiteral
&&	TokenNameAND_AND
buf	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0x0000	TokenNameIntegerLiteral
&&	TokenNameAND_AND
buf	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0x003f	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
"UnicodeBig"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'<'	TokenNameCharacterLiteral
:	TokenNameCOLON
switch	TokenNameswitch
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
0x00FF	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0x003f	TokenNameIntegerLiteral
&&	TokenNameAND_AND
buf	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0x0000	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
"UnicodeLittle"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'?'	TokenNameCharacterLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'x'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
buf	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'm'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Reader	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
createXMLDeclarationReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
"UTF8"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
enc	TokenNameIdentifier
=	TokenNameEQUAL
getXMLDeclarationEncoding	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
,	TokenNameCOMMA
"UTF8"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
enc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
0x004C	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0x006f	TokenNameIntegerLiteral
&&	TokenNameAND_AND
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
0x00FF	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0x00a7	TokenNameIntegerLiteral
&&	TokenNameAND_AND
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
0x00FF	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0x0094	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Reader	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
createXMLDeclarationReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
"CP037"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
enc	TokenNameIdentifier
=	TokenNameEQUAL
getXMLDeclarationEncoding	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
,	TokenNameCOMMA
"CP037"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
enc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
0x00FE	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
0x00FF	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0x00FF	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
"Unicode"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
0x00FF	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
buf	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&	TokenNameAND
0x00FF	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0x00FE	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
"Unicode"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
pbis	TokenNameIdentifier
,	TokenNameCOMMA
"UTF8"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
Reader	TokenNameIdentifier
createXMLDeclarationReader	TokenNameIdentifier
(	TokenNameLPAREN
PushbackInputStream	TokenNameIdentifier
pbis	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
enc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
128	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
pbis	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
pbis	TokenNameIdentifier
.	TokenNameDOT
unread	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ByteArrayInputStream	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
enc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
String	TokenNameIdentifier
getXMLDeclarationEncoding	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
r	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
c	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'l'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'v'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'e'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'r'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
's'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'i'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'o'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'n'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'='	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'"'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'\''	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
char	TokenNamechar
sc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
c	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
sc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isXMLVersionCharacter	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'e'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'n'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'c'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'o'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'd'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'i'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'n'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'g'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'='	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
isXMLSpace	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'"'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'\''	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
c	TokenNameIdentifier
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
enc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
sc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
encodingToJavaEncoding	TokenNameIdentifier
(	TokenNameLPAREN
enc	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
enc	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
encodingToJavaEncoding	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
e	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
de	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
EncodingUtilities	TokenNameIdentifier
.	TokenNameDOT
javaEncoding	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
result	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
de	TokenNameIdentifier
:	TokenNameCOLON
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
