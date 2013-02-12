package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
transcoder	TokenNameIdentifier
.	TokenNameDOT
wmf	TokenNameIdentifier
.	TokenNameDOT
tosvg	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MetaRecord	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
functionId	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
numPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
ptVector	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
MetaRecord	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
EnsureCapacity	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
cc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
AddElement	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ptVector	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
addElement	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
iValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ptVector	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
iValue	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Integer	TokenNameIdentifier
ElementAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
ptVector	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
ptVector	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
ByteRecord	TokenNameIdentifier
extends	TokenNameextends
MetaRecord	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bstr	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ByteRecord	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bstr	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
bstr	TokenNameIdentifier
=	TokenNameEQUAL
bstr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
StringRecord	TokenNameIdentifier
extends	TokenNameextends
MetaRecord	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
text	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
StringRecord	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newText	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
text	TokenNameIdentifier
=	TokenNameEQUAL
newText	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE