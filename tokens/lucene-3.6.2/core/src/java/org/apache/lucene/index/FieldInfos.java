package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Fieldable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
FieldInfo	TokenNameIdentifier
.	TokenNameDOT
IndexOptions	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
Directory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
IndexInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
IndexOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StringHelper	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
FieldInfos	TokenNameIdentifier
implements	TokenNameimplements
Iterable	TokenNameIdentifier
<	TokenNameLESS
FieldInfo	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FORMAT_PRE	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FORMAT_START	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FORMAT_OMIT_POSITIONS	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
CURRENT_FORMAT	TokenNameIdentifier
=	TokenNameEQUAL
FORMAT_OMIT_POSITIONS	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
IS_INDEXED	TokenNameIdentifier
=	TokenNameEQUAL
0x1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
STORE_TERMVECTOR	TokenNameIdentifier
=	TokenNameEQUAL
0x2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
OMIT_NORMS	TokenNameIdentifier
=	TokenNameEQUAL
0x10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
STORE_PAYLOADS	TokenNameIdentifier
=	TokenNameEQUAL
0x20	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
OMIT_TERM_FREQ_AND_POSITIONS	TokenNameIdentifier
=	TokenNameEQUAL
0x40	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
OMIT_POSITIONS	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
128	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FieldInfo	TokenNameIdentifier
>	TokenNameGREATER
byNumber	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FieldInfo	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
FieldInfo	TokenNameIdentifier
>	TokenNameGREATER
byName	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
FieldInfo	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
format	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
FieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
d	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexInput	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
d	TokenNameIdentifier
.	TokenNameDOT
openInput	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
read	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
FORMAT_PRE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
input	TokenNameIdentifier
.	TokenNameDOT
seek	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
input	TokenNameIdentifier
.	TokenNameDOT
setModifiedUTF8StringsMode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byNumber	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byName	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
read	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
ioe	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
ioe	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
input	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
FieldInfos	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
:	TokenNameCOLON
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
add	TokenNameIdentifier
(	TokenNameLPAREN
fieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
synchronized	TokenNamesynchronized
public	TokenNamepublic
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
FieldInfos	TokenNameIdentifier
fis	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
numField	TokenNameIdentifier
=	TokenNameEQUAL
byNumber	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
numField	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
byNumber	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fis	TokenNameIdentifier
.	TokenNameDOT
byNumber	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
fi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fis	TokenNameIdentifier
.	TokenNameDOT
byName	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
fis	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
synchronized	TokenNamesynchronized
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Fieldable	TokenNameIdentifier
>	TokenNameGREATER
fields	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Fieldable	TokenNameIdentifier
field	TokenNameIdentifier
:	TokenNameCOLON
fields	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
add	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
field	TokenNameIdentifier
.	TokenNameDOT
isIndexed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
field	TokenNameIdentifier
.	TokenNameDOT
isTermVectorStored	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
field	TokenNameIdentifier
.	TokenNameDOT
getOmitNorms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
field	TokenNameIdentifier
.	TokenNameDOT
getIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasProx	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
numFields	TokenNameIdentifier
=	TokenNameEQUAL
byNumber	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
numFields	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
isIndexed	TokenNameIdentifier
&&	TokenNameAND_AND
fi	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
synchronized	TokenNamesynchronized
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isIndexed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
add	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
synchronized	TokenNamesynchronized
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
storeTermVector	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
add	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
synchronized	TokenNamesynchronized
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
omitNorms	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
add	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
omitNorms	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
synchronized	TokenNamesynchronized
public	TokenNamepublic
FieldInfo	TokenNameIdentifier
add	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
omitNorms	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
storePayloads	TokenNameIdentifier
,	TokenNameCOMMA
IndexOptions	TokenNameIdentifier
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fi	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
addInternal	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
omitNorms	TokenNameIdentifier
,	TokenNameCOMMA
storePayloads	TokenNameIdentifier
,	TokenNameCOMMA
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
fi	TokenNameIdentifier
.	TokenNameDOT
update	TokenNameIdentifier
(	TokenNameLPAREN
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
omitNorms	TokenNameIdentifier
,	TokenNameCOMMA
storePayloads	TokenNameIdentifier
,	TokenNameCOMMA
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
fi	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
||	TokenNameOR_OR
!	TokenNameNOT
fi	TokenNameIdentifier
.	TokenNameDOT
storePayloads	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
fi	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
synchronized	TokenNamesynchronized
public	TokenNamepublic
FieldInfo	TokenNameIdentifier
add	TokenNameIdentifier
(	TokenNameLPAREN
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
add	TokenNameIdentifier
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
omitNorms	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
storePayloads	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
FieldInfo	TokenNameIdentifier
addInternal	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
omitNorms	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
storePayloads	TokenNameIdentifier
,	TokenNameCOMMA
IndexOptions	TokenNameIdentifier
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
name	TokenNameIdentifier
=	TokenNameEQUAL
StringHelper	TokenNameIdentifier
.	TokenNameDOT
intern	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
byNumber	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
omitNorms	TokenNameIdentifier
,	TokenNameCOMMA
storePayloads	TokenNameIdentifier
,	TokenNameCOMMA
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byNumber	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
fi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byName	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
fi	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
fieldNumber	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
fi	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
fi	TokenNameIdentifier
.	TokenNameDOT
number	TokenNameIdentifier
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
byName	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
fieldNumber	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
fieldNumber	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
fi	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
fi	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
:	TokenNameCOLON
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
fieldNumber	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
fieldNumber	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
byNumber	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldNumber	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
<	TokenNameLESS
FieldInfo	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
byNumber	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
byNumber	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasVectors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
hasVectors	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
storeTermVector	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
hasVectors	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
hasVectors	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
d	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexOutput	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
d	TokenNameIdentifier
.	TokenNameDOT
createOutput	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
write	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
IndexOutput	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
CURRENT_FORMAT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
fi	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
||	TokenNameOR_OR
!	TokenNameNOT
fi	TokenNameIdentifier
.	TokenNameDOT
storePayloads	TokenNameIdentifier
;	TokenNameSEMICOLON
byte	TokenNamebyte
bits	TokenNameIdentifier
=	TokenNameEQUAL
0x0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
isIndexed	TokenNameIdentifier
)	TokenNameRPAREN
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
IS_INDEXED	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
storeTermVector	TokenNameIdentifier
)	TokenNameRPAREN
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
STORE_TERMVECTOR	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
omitNorms	TokenNameIdentifier
)	TokenNameRPAREN
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
OMIT_NORMS	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
storePayloads	TokenNameIdentifier
)	TokenNameRPAREN
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
STORE_PAYLOADS	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
OMIT_TERM_FREQ_AND_POSITIONS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
OMIT_POSITIONS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
output	TokenNameIdentifier
.	TokenNameDOT
writeString	TokenNameIdentifier
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
bits	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
read	TokenNameIdentifier
(	TokenNameLPAREN
IndexInput	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fileName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
firstInt	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
firstInt	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
format	TokenNameIdentifier
=	TokenNameEQUAL
firstInt	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
format	TokenNameIdentifier
=	TokenNameEQUAL
FORMAT_PRE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
FORMAT_PRE	TokenNameIdentifier
&&	TokenNameAND_AND
format	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
FORMAT_START	TokenNameIdentifier
&&	TokenNameAND_AND
format	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
FORMAT_OMIT_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
CorruptIndexException	TokenNameIdentifier
(	TokenNameLPAREN
"unrecognized format "	TokenNameStringLiteral
+	TokenNamePLUS
format	TokenNameIdentifier
+	TokenNamePLUS
" in file ""	TokenNameStringLiteral
+	TokenNamePLUS
fileName	TokenNameIdentifier
+	TokenNamePLUS
"""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
size	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
FORMAT_PRE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
size	TokenNameIdentifier
=	TokenNameEQUAL
firstInt	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
size	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
StringHelper	TokenNameIdentifier
.	TokenNameDOT
intern	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
.	TokenNameDOT
readString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
bits	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isIndexed	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
bits	TokenNameIdentifier
&	TokenNameAND
IS_INDEXED	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
boolean	TokenNameboolean
storeTermVector	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
bits	TokenNameIdentifier
&	TokenNameAND
STORE_TERMVECTOR	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
boolean	TokenNameboolean
omitNorms	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
bits	TokenNameIdentifier
&	TokenNameAND
OMIT_NORMS	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
boolean	TokenNameboolean
storePayloads	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
bits	TokenNameIdentifier
&	TokenNameAND
STORE_PAYLOADS	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
IndexOptions	TokenNameIdentifier
indexOptions	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
bits	TokenNameIdentifier
&	TokenNameAND
OMIT_TERM_FREQ_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
indexOptions	TokenNameIdentifier
=	TokenNameEQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
bits	TokenNameIdentifier
&	TokenNameAND
OMIT_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
FORMAT_OMIT_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
indexOptions	TokenNameIdentifier
=	TokenNameEQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
CorruptIndexException	TokenNameIdentifier
(	TokenNameLPAREN
"Corrupt fieldinfos, OMIT_POSITIONS set but format="	TokenNameStringLiteral
+	TokenNamePLUS
format	TokenNameIdentifier
+	TokenNamePLUS
" (resource: "	TokenNameStringLiteral
+	TokenNamePLUS
input	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
indexOptions	TokenNameIdentifier
=	TokenNameEQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
indexOptions	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
storePayloads	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
addInternal	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
isIndexed	TokenNameIdentifier
,	TokenNameCOMMA
storeTermVector	TokenNameIdentifier
,	TokenNameCOMMA
omitNorms	TokenNameIdentifier
,	TokenNameCOMMA
storePayloads	TokenNameIdentifier
,	TokenNameCOMMA
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
input	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
input	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
CorruptIndexException	TokenNameIdentifier
(	TokenNameLPAREN
"did not read all bytes from file ""	TokenNameStringLiteral
+	TokenNamePLUS
fileName	TokenNameIdentifier
+	TokenNamePLUS
"": read "	TokenNameStringLiteral
+	TokenNamePLUS
input	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" vs size "	TokenNameStringLiteral
+	TokenNamePLUS
input	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" (resource: "	TokenNameStringLiteral
+	TokenNamePLUS
input	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE