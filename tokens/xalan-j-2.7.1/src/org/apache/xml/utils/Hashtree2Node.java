package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
Hashtree2Node	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
appendHashToNode	TokenNameIdentifier
(	TokenNameLPAREN
Hashtable	TokenNameIdentifier
hash	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
Node	TokenNameIdentifier
container	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
factory	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
container	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
factory	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
elemName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
name	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
""	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
elemName	TokenNameIdentifier
=	TokenNameEQUAL
"appendHashToNode"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
elemName	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Element	TokenNameIdentifier
hashNode	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
elemName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
container	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
hashNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Enumeration	TokenNameIdentifier
keys	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
.	TokenNameDOT
keys	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
keys	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
keyStr	TokenNameIdentifier
=	TokenNameEQUAL
key	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
item	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
item	TokenNameIdentifier
instanceof	TokenNameinstanceof
Hashtable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
v	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
keyStr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Hashtable	TokenNameIdentifier
)	TokenNameRPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Element	TokenNameIdentifier
node	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
"item"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
node	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"key"	TokenNameStringLiteral
,	TokenNameCOMMA
keyStr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
node	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
factory	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hashNode	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
node	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
"item"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
node	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"key"	TokenNameStringLiteral
,	TokenNameCOMMA
keyStr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
node	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
factory	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
"ERROR: Reading "	TokenNameStringLiteral
+	TokenNamePLUS
key	TokenNameIdentifier
+	TokenNamePLUS
" threw: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hashNode	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
Iterator	TokenNameIdentifier
it	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Hashtable	TokenNameIdentifier
h	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Hashtable	TokenNameIdentifier
)	TokenNameRPAREN
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
appendHashToNode	TokenNameIdentifier
(	TokenNameLPAREN
h	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
,	TokenNameCOMMA
hashNode	TokenNameIdentifier
,	TokenNameCOMMA
factory	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e2	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
