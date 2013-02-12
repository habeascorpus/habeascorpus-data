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
Iterator	TokenNameIdentifier
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
RAMFile	TokenNameIdentifier
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
RAMInputStream	TokenNameIdentifier
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
RAMOutputStream	TokenNameIdentifier
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
BytesRef	TokenNameIdentifier
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
class	TokenNameclass
PrefixCodedTerms	TokenNameIdentifier
implements	TokenNameimplements
Iterable	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
final	TokenNamefinal
RAMFile	TokenNameIdentifier
buffer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
PrefixCodedTerms	TokenNameIdentifier
(	TokenNameLPAREN
RAMFile	TokenNameIdentifier
buffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
buffer	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getSizeInBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
buffer	TokenNameIdentifier
.	TokenNameDOT
getSizeInBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
PrefixCodedTermsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
class	TokenNameclass
PrefixCodedTermsIterator	TokenNameIdentifier
implements	TokenNameimplements
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
final	TokenNamefinal
IndexInput	TokenNameIdentifier
input	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
field	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
BytesRef	TokenNameIdentifier
bytes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Term	TokenNameIdentifier
term	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTermsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
input	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMInputStream	TokenNameIdentifier
(	TokenNameLPAREN
"PrefixCodedTermsIterator"	TokenNameStringLiteral
,	TokenNameCOMMA
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
input	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
input	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Term	TokenNameIdentifier
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
code	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
code	TokenNameIdentifier
&	TokenNameAND
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
field	TokenNameIdentifier
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
}	TokenNameRBRACE
int	TokenNameint
prefix	TokenNameIdentifier
=	TokenNameEQUAL
code	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
suffix	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bytes	TokenNameIdentifier
.	TokenNameDOT
grow	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
suffix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
input	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
prefix	TokenNameIdentifier
,	TokenNameCOMMA
suffix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bytes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
=	TokenNameEQUAL
prefix	TokenNameIdentifier
+	TokenNamePLUS
suffix	TokenNameIdentifier
;	TokenNameSEMICOLON
term	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
bytes	TokenNameIdentifier
.	TokenNameDOT
utf8ToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
term	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Builder	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
RAMFile	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
RAMOutputStream	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Term	TokenNameIdentifier
lastTerm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
BytesRef	TokenNameIdentifier
lastBytes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
BytesRef	TokenNameIdentifier
scratch	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
lastTerm	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
term	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
lastTerm	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
scratch	TokenNameIdentifier
.	TokenNameDOT
copyChars	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
prefix	TokenNameIdentifier
=	TokenNameEQUAL
sharedPrefix	TokenNameIdentifier
(	TokenNameLPAREN
lastBytes	TokenNameIdentifier
,	TokenNameCOMMA
scratch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
suffix	TokenNameIdentifier
=	TokenNameEQUAL
scratch	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
term	TokenNameIdentifier
.	TokenNameDOT
field	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
lastTerm	TokenNameIdentifier
.	TokenNameDOT
field	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
|	TokenNameOR
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
writeString	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
.	TokenNameDOT
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
output	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
suffix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
scratch	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
scratch	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
prefix	TokenNameIdentifier
,	TokenNameCOMMA
suffix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastBytes	TokenNameIdentifier
.	TokenNameDOT
copyBytes	TokenNameIdentifier
(	TokenNameLPAREN
scratch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastTerm	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
=	TokenNameEQUAL
term	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
;	TokenNameSEMICOLON
lastTerm	TokenNameIdentifier
.	TokenNameDOT
field	TokenNameIdentifier
=	TokenNameEQUAL
term	TokenNameIdentifier
.	TokenNameDOT
field	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
PrefixCodedTerms	TokenNameIdentifier
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
sharedPrefix	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
term1	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
term2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
pos1	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
pos1End	TokenNameIdentifier
=	TokenNameEQUAL
pos1	TokenNameIdentifier
+	TokenNamePLUS
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
term1	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
term2	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
pos2	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pos1	TokenNameIdentifier
<	TokenNameLESS
pos1End	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
term1	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
term1	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
pos1	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
term2	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
term2	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
pos2	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
pos1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
pos1	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
pos2	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
pos1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE