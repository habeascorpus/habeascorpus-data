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
final	TokenNamefinal
class	TokenNameclass
SegmentTermEnum	TokenNameIdentifier
extends	TokenNameextends
TermEnum	TokenNameIdentifier
implements	TokenNameimplements
Cloneable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
IndexInput	TokenNameIdentifier
input	TokenNameIdentifier
;	TokenNameSEMICOLON
FieldInfos	TokenNameIdentifier
fieldInfos	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
size	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
position	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
first	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
private	TokenNameprivate
TermBuffer	TokenNameIdentifier
termBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
TermBuffer	TokenNameIdentifier
prevBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
TermBuffer	TokenNameIdentifier
scanBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
TermInfo	TokenNameIdentifier
termInfo	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
format	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
isIndex	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
long	TokenNamelong
indexPointer	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
indexInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
skipInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
maxSkipLevels	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
formatM1SkipInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
SegmentTermEnum	TokenNameIdentifier
(	TokenNameLPAREN
IndexInput	TokenNameIdentifier
i	TokenNameIdentifier
,	TokenNameCOMMA
FieldInfos	TokenNameIdentifier
fis	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isi	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
input	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
fieldInfos	TokenNameIdentifier
=	TokenNameEQUAL
fis	TokenNameIdentifier
;	TokenNameSEMICOLON
isIndex	TokenNameIdentifier
=	TokenNameEQUAL
isi	TokenNameIdentifier
;	TokenNameSEMICOLON
maxSkipLevels	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
firstInt	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
firstInt	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
format	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
size	TokenNameIdentifier
=	TokenNameEQUAL
firstInt	TokenNameIdentifier
;	TokenNameSEMICOLON
indexInterval	TokenNameIdentifier
=	TokenNameEQUAL
128	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
skipInterval	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
format	TokenNameIdentifier
=	TokenNameEQUAL
firstInt	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
<	TokenNameLESS
TermInfosWriter	TokenNameIdentifier
.	TokenNameDOT
FORMAT_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IndexFormatTooNewException	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
format	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
TermInfosWriter	TokenNameIdentifier
.	TokenNameDOT
FORMAT_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
indexInterval	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
formatM1SkipInterval	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
skipInterval	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
indexInterval	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
skipInterval	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
TermInfosWriter	TokenNameIdentifier
.	TokenNameDOT
FORMAT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
maxSkipLevels	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
assert	TokenNameassert
indexInterval	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
:	TokenNameCOLON
"indexInterval="	TokenNameStringLiteral
+	TokenNamePLUS
indexInterval	TokenNameIdentifier
+	TokenNamePLUS
" is negative; must be > 0"	TokenNameStringLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
skipInterval	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
:	TokenNameCOLON
"skipInterval="	TokenNameStringLiteral
+	TokenNamePLUS
skipInterval	TokenNameIdentifier
+	TokenNamePLUS
" is negative; must be > 0"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
>	TokenNameGREATER
TermInfosWriter	TokenNameIdentifier
.	TokenNameDOT
FORMAT_VERSION_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
termBuffer	TokenNameIdentifier
.	TokenNameDOT
setPreUTF8Strings	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
scanBuffer	TokenNameIdentifier
.	TokenNameDOT
setPreUTF8Strings	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prevBuffer	TokenNameIdentifier
.	TokenNameDOT
setPreUTF8Strings	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SegmentTermEnum	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
clone	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SegmentTermEnum	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
CloneNotSupportedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
clone	TokenNameIdentifier
.	TokenNameDOT
input	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
IndexInput	TokenNameIdentifier
)	TokenNameRPAREN
input	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
termInfo	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermInfo	TokenNameIdentifier
(	TokenNameLPAREN
termInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
termBuffer	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TermBuffer	TokenNameIdentifier
)	TokenNameRPAREN
termBuffer	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
prevBuffer	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TermBuffer	TokenNameIdentifier
)	TokenNameRPAREN
prevBuffer	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
scanBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
void	TokenNamevoid
seek	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
pointer	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
p	TokenNameIdentifier
,	TokenNameCOMMA
Term	TokenNameIdentifier
t	TokenNameIdentifier
,	TokenNameCOMMA
TermInfo	TokenNameIdentifier
ti	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
input	TokenNameIdentifier
.	TokenNameDOT
seek	TokenNameIdentifier
(	TokenNameLPAREN
pointer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
position	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
;	TokenNameSEMICOLON
termBuffer	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prevBuffer	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termInfo	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
ti	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
first	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
boolean	TokenNameboolean
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
position	TokenNameIdentifier
++	TokenNamePLUS_PLUS
>=	TokenNameGREATER_EQUAL
size	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
prevBuffer	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termBuffer	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
prevBuffer	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termBuffer	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
fieldInfos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termInfo	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termInfo	TokenNameIdentifier
.	TokenNameDOT
freqPointer	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termInfo	TokenNameIdentifier
.	TokenNameDOT
proxPointer	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
format	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
termInfo	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
>	TokenNameGREATER
formatM1SkipInterval	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
termInfo	TokenNameIdentifier
.	TokenNameDOT
skipOffset	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
termInfo	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
skipInterval	TokenNameIdentifier
)	TokenNameRPAREN
termInfo	TokenNameIdentifier
.	TokenNameDOT
skipOffset	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
isIndex	TokenNameIdentifier
)	TokenNameRPAREN
indexPointer	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
input	TokenNameIdentifier
.	TokenNameDOT
readVLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
scanTo	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
scanBuffer	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
first	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
first	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
count	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
scanBuffer	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
count	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
Term	TokenNameIdentifier
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termBuffer	TokenNameIdentifier
.	TokenNameDOT
toTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
Term	TokenNameIdentifier
prev	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
prevBuffer	TokenNameIdentifier
.	TokenNameDOT
toTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
TermInfo	TokenNameIdentifier
termInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
TermInfo	TokenNameIdentifier
(	TokenNameLPAREN
termInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
void	TokenNamevoid
termInfo	TokenNameIdentifier
(	TokenNameLPAREN
TermInfo	TokenNameIdentifier
ti	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ti	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
termInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
docFreq	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termInfo	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
long	TokenNamelong
freqPointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termInfo	TokenNameIdentifier
.	TokenNameDOT
freqPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
long	TokenNamelong
proxPointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termInfo	TokenNameIdentifier
.	TokenNameDOT
proxPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
input	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE