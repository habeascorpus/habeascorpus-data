package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
AttributedCharacterIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
AttributedString	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
CharacterIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
StringCharacterIterator	TokenNameIdentifier
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
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
GVTACIImpl	TokenNameIdentifier
implements	TokenNameimplements
GVTAttributedCharacterIterator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
simpleString	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Set	TokenNameIdentifier
allAttributes	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
ArrayList	TokenNameIdentifier
mapList	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
START_RUN	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
END_RUN	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
MID_RUN	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
SINGLETON	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
charInRun	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
CharacterIterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
currentIndex	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
GVTACIImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
simpleString	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
buildAttributeTables	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
GVTACIImpl	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
aci	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buildAttributeTables	TokenNameIdentifier
(	TokenNameLPAREN
aci	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
simpleString	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringCharacterIterator	TokenNameIdentifier
(	TokenNameLPAREN
simpleString	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buildAttributeTables	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setString	TokenNameIdentifier
(	TokenNameLPAREN
AttributedString	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
iter	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
getIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buildAttributeTables	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setAttributeArray	TokenNameIdentifier
(	TokenNameLPAREN
GVTAttributedCharacterIterator	TokenNameIdentifier
.	TokenNameDOT
TextAttribute	TokenNameIdentifier
attr	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
attValues	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
beginIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
endIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
beginIndex	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
beginIndex	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
endIndex	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
endIndex	TokenNameIdentifier
,	TokenNameCOMMA
simpleString	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
beginIndex	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
END_RUN	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
beginIndex	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
MID_RUN	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
beginIndex	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
END_RUN	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
beginIndex	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
SINGLETON	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
endIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
END_RUN	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
endIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
SINGLETON	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
endIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
MID_RUN	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
endIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
START_RUN	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
beginIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
endIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
SINGLETON	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
attValues	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
Map	TokenNameIdentifier
)	TokenNameRPAREN
mapList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
attr	TokenNameIdentifier
,	TokenNameCOMMA
attValues	TokenNameIdentifier
[	TokenNameLBRACKET
n	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Set	TokenNameIdentifier
getAllAttributeKeys	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
allAttributes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
.	TokenNameDOT
Attribute	TokenNameIdentifier
attribute	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
attribute	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Map	TokenNameIdentifier
getAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Map	TokenNameIdentifier
)	TokenNameRPAREN
mapList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
currentIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getRunLimit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ndx	TokenNameIdentifier
=	TokenNameEQUAL
currentIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
++	TokenNamePLUS_PLUS
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
ndx	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
MID_RUN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getRunLimit	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
.	TokenNameDOT
Attribute	TokenNameIdentifier
attribute	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ndx	TokenNameIdentifier
=	TokenNameEQUAL
currentIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
getAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
attribute	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
do	TokenNamedo
{	TokenNameLBRACE
++	TokenNamePLUS_PLUS
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Map	TokenNameIdentifier
)	TokenNameRPAREN
mapList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ndx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
attribute	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
do	TokenNamedo
{	TokenNameLBRACE
++	TokenNamePLUS_PLUS
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Map	TokenNameIdentifier
)	TokenNameRPAREN
mapList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ndx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
attribute	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getRunLimit	TokenNameIdentifier
(	TokenNameLPAREN
Set	TokenNameIdentifier
attributes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ndx	TokenNameIdentifier
=	TokenNameEQUAL
currentIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
++	TokenNamePLUS_PLUS
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
attributes	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
mapList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ndx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getRunStart	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ndx	TokenNameIdentifier
=	TokenNameEQUAL
currentIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
ndx	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
MID_RUN	TokenNameIdentifier
)	TokenNameRPAREN
--	TokenNameMINUS_MINUS
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getRunStart	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
.	TokenNameDOT
Attribute	TokenNameIdentifier
attribute	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ndx	TokenNameIdentifier
=	TokenNameEQUAL
currentIndex	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
getAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
attribute	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Map	TokenNameIdentifier
)	TokenNameRPAREN
mapList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ndx	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
attribute	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
--	TokenNameMINUS_MINUS
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Map	TokenNameIdentifier
)	TokenNameRPAREN
mapList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ndx	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
attribute	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
--	TokenNameMINUS_MINUS
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IndexOutOfBoundsException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getRunStart	TokenNameIdentifier
(	TokenNameLPAREN
Set	TokenNameIdentifier
attributes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ndx	TokenNameIdentifier
=	TokenNameEQUAL
currentIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
attributes	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
mapList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ndx	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
--	TokenNameMINUS_MINUS
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IndexOutOfBoundsException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
ndx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
GVTAttributedCharacterIterator	TokenNameIdentifier
cloneACI	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GVTACIImpl	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cloneACI	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
char	TokenNamechar
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
char	TokenNamechar
first	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getBeginIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
getBeginIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getEndIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
getEndIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
char	TokenNamechar
last	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
last	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
char	TokenNamechar
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
char	TokenNamechar
previous	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
previous	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
char	TokenNamechar
setIndex	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
position	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iter	TokenNameIdentifier
.	TokenNameDOT
setIndex	TokenNameIdentifier
(	TokenNameLPAREN
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
buildAttributeTables	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
allAttributes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mapList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
simpleString	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
charInRun	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
simpleString	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
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
charInRun	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
SINGLETON	TokenNameIdentifier
;	TokenNameSEMICOLON
mapList	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
buildAttributeTables	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
aci	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
allAttributes	TokenNameIdentifier
=	TokenNameEQUAL
aci	TokenNameIdentifier
.	TokenNameDOT
getAllAttributeKeys	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
aci	TokenNameIdentifier
.	TokenNameDOT
getEndIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
aci	TokenNameIdentifier
.	TokenNameDOT
getBeginIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mapList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
charInRun	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
length	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
char	TokenNamechar
c	TokenNameIdentifier
=	TokenNameEQUAL
aci	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chars	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
length	TokenNameIdentifier
]	TokenNameRBRACKET
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
chars	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
c	TokenNameIdentifier
;	TokenNameSEMICOLON
charInRun	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
SINGLETON	TokenNameIdentifier
;	TokenNameSEMICOLON
mapList	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
aci	TokenNameIdentifier
.	TokenNameDOT
getAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
=	TokenNameEQUAL
aci	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
simpleString	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
chars	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
class	TokenNameclass
TransformAttributeFilter	TokenNameIdentifier
implements	TokenNameimplements
GVTAttributedCharacterIterator	TokenNameIdentifier
.	TokenNameDOT
AttributeFilter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
AttributedCharacterIterator	TokenNameIdentifier
mutateAttributes	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
aci	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
aci	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE