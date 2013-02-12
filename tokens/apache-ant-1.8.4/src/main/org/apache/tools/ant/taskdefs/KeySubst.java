package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileWriter	TokenNameIdentifier
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
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StringTokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Task	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
FileUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
KeySubst	TokenNameIdentifier
extends	TokenNameextends
Task	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
File	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
dest	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
sep	TokenNameIdentifier
=	TokenNameEQUAL
"*"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Hashtable	TokenNameIdentifier
replacements	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"!! KeySubst is deprecated. Use Filter + Copy instead. !!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
"Performing Substitutions"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
source	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
dest	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"Source and destinations must not be null"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
BufferedReader	TokenNameIdentifier
br	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
BufferedWriter	TokenNameIdentifier
bw	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
br	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedReader	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileReader	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dest	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bw	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedWriter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileWriter	TokenNameIdentifier
(	TokenNameLPAREN
dest	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
line	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
newline	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
br	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
line	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
bw	TokenNameIdentifier
.	TokenNameDOT
newLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
newline	TokenNameIdentifier
=	TokenNameEQUAL
KeySubst	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
,	TokenNameCOMMA
replacements	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bw	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
newline	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bw	TokenNameIdentifier
.	TokenNameDOT
newLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
line	TokenNameIdentifier
=	TokenNameEQUAL
br	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
bw	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ioe	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
bw	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
br	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
source	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDest	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
dest	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
dest	TokenNameIdentifier
=	TokenNameEQUAL
dest	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSep	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
sep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
sep	TokenNameIdentifier
=	TokenNameEQUAL
sep	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setKeys	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
keys	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
keys	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
StringTokenizer	TokenNameIdentifier
tok	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
sep	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
tok	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
token	TokenNameIdentifier
=	TokenNameEQUAL
tok	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringTokenizer	TokenNameIdentifier
itok	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
,	TokenNameCOMMA
"="	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
itok	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
itok	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
replacements	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Hashtable	TokenNameIdentifier
hash	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"VERSION"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"b"	TokenNameStringLiteral
,	TokenNameCOMMA
"ffff"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
KeySubst	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
"$f ${VERSION} f ${b} jj $"	TokenNameStringLiteral
,	TokenNameCOMMA
hash	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
replace	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
origString	TokenNameIdentifier
,	TokenNameCOMMA
Hashtable	TokenNameIdentifier
keys	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
finalString	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
index	TokenNameIdentifier
=	TokenNameEQUAL
origString	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"${"	TokenNameStringLiteral
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
key	TokenNameIdentifier
=	TokenNameEQUAL
origString	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
origString	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"}"	TokenNameStringLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
+	TokenNamePLUS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
finalString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
origString	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
finalString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
finalString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"${"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
finalString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
finalString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"}"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
i	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
+	TokenNamePLUS
3	TokenNameIntegerLiteral
+	TokenNamePLUS
key	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finalString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
origString	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
finalString	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
