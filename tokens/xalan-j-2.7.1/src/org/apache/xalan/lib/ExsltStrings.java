package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
lib	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StringTokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
DocumentBuilderFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
FactoryConfigurationError	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
ParserConfigurationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
NodeSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
NodeList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Text	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ExsltStrings	TokenNameIdentifier
extends	TokenNameextends
ExsltBase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
align	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
targetStr	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
paddingStr	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
targetStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
paddingStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
targetStr	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
paddingStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"right"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
paddingStr	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
paddingStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
targetStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
targetStr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"center"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
paddingStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
targetStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
paddingStr	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
startIndex	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
targetStr	TokenNameIdentifier
+	TokenNamePLUS
paddingStr	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
+	TokenNamePLUS
targetStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
targetStr	TokenNameIdentifier
+	TokenNamePLUS
paddingStr	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
targetStr	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
align	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
targetStr	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
paddingStr	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
align	TokenNameIdentifier
(	TokenNameLPAREN
targetStr	TokenNameIdentifier
,	TokenNameCOMMA
paddingStr	TokenNameIdentifier
,	TokenNameCOMMA
"left"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
concat	TokenNameIdentifier
(	TokenNameLPAREN
NodeList	TokenNameIdentifier
nl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
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
nl	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
node	TokenNameIdentifier
=	TokenNameEQUAL
nl	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
toString	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
value	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
padding	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
length	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pattern	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
pattern	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
length	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
numAdded	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
numAdded	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
pattern	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
index	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
numAdded	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
padding	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
padding	TokenNameIdentifier
(	TokenNameLPAREN
length	TokenNameIdentifier
,	TokenNameCOMMA
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NodeList	TokenNameIdentifier
split	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
NodeSet	TokenNameIdentifier
resultSet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NodeSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resultSet	TokenNameIdentifier
.	TokenNameDOT
setShouldCacheNodes	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
done	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
int	TokenNameint
fromIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
matchIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
token	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
!	TokenNameNOT
done	TokenNameIdentifier
&&	TokenNameAND_AND
fromIndex	TokenNameIdentifier
<	TokenNameLESS
str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
matchIndex	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
,	TokenNameCOMMA
fromIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
matchIndex	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
token	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
fromIndex	TokenNameIdentifier
,	TokenNameCOMMA
matchIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fromIndex	TokenNameIdentifier
=	TokenNameEQUAL
matchIndex	TokenNameIdentifier
+	TokenNamePLUS
pattern	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
done	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
token	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
fromIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
DocumentHolder	TokenNameIdentifier
.	TokenNameDOT
m_doc	TokenNameIdentifier
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
element	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
"token"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Text	TokenNameIdentifier
text	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
element	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resultSet	TokenNameIdentifier
.	TokenNameDOT
addNode	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
resultSet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NodeList	TokenNameIdentifier
split	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
split	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
,	TokenNameCOMMA
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NodeList	TokenNameIdentifier
tokenize	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
toTokenize	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
delims	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
NodeSet	TokenNameIdentifier
resultSet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NodeSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
delims	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
delims	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
StringTokenizer	TokenNameIdentifier
lTokenizer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
toTokenize	TokenNameIdentifier
,	TokenNameCOMMA
delims	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
DocumentHolder	TokenNameIdentifier
.	TokenNameDOT
m_doc	TokenNameIdentifier
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
lTokenizer	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
element	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
"token"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
element	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
lTokenizer	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resultSet	TokenNameIdentifier
.	TokenNameDOT
addNode	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
DocumentHolder	TokenNameIdentifier
.	TokenNameDOT
m_doc	TokenNameIdentifier
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
toTokenize	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
element	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
"token"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
element	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
toTokenize	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resultSet	TokenNameIdentifier
.	TokenNameDOT
addNode	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
resultSet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NodeList	TokenNameIdentifier
tokenize	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
toTokenize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
tokenize	TokenNameIdentifier
(	TokenNameLPAREN
toTokenize	TokenNameIdentifier
,	TokenNameCOMMA
"   "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
DocumentHolder	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Document	TokenNameIdentifier
m_doc	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
m_doc	TokenNameIdentifier
=	TokenNameEQUAL
DocumentBuilderFactory	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
newDocumentBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
newDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ParserConfigurationException	TokenNameIdentifier
pce	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
pce	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
